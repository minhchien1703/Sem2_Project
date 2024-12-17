package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.model.Cart;
import com.sem2.sem2_project.model.CartSummary;
import com.sem2.sem2_project.model.Product;
import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.model.enums.CartStatus;
import com.sem2.sem2_project.repository.CartRepository;
import com.sem2.sem2_project.repository.CartSummaryRepository;
import com.sem2.sem2_project.repository.UserRepository;
import com.sem2.sem2_project.repository.projection.CartSummaryProjection;
import com.sem2.sem2_project.service.AuthenticationService;
import com.sem2.sem2_project.service.CartSummaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartSummaryServiceImpl implements CartSummaryService {
    private final CartSummaryRepository cartSummaryRepository;
    private final CartRepository cartRepository;
    private final AuthenticationService authenticationService;

    @Override
    public String updateCartSummary() {
        User user = authenticationService.getCurrenAuthenticatedUser();
        List<Cart> carts = cartRepository.findCartByUserId(user.getId());

        if (carts.isEmpty()) {
            CartSummary cartSummary = cartSummaryRepository.findCartSummaryByUser(user.getId());
            cartSummary.setDiscount(0);
            cartSummary.setSubtotal(0);
            cartSummary.setTotal(0);
            cartSummary.setTax(0);
            cartSummaryRepository.save(cartSummary);
            return "!";
        }

        // Tính toán Subtotal
        double subtotal = carts.stream()
                .mapToDouble(cart -> cart.getProduct().getPrice() * cart.getQuantity())
                .sum();

        // Tính toán Discount
        double discount = carts.stream()
                .mapToDouble(cart -> {
                    Product product = cart.getProduct();
                    double sale = product.getSale() / 100.0;
                    return product.getPrice() * cart.getQuantity() * sale;
                })
                .sum();

        double taxRate = 0.05;
        double tax = subtotal * taxRate;
        double total = subtotal + tax - discount;

        try {
            CartSummary cartSummary = cartSummaryRepository.findCartSummaryByUser(user.getId());
            if (cartSummary == null) {
                CartSummary cartSummaryNew = new CartSummary();
                cartSummaryNew.setUser(user);
                cartSummaryNew.setSubtotal(subtotal);
                cartSummaryNew.setDiscount(discount);
                cartSummaryNew.setTax(tax);
                cartSummaryNew.setTotal(total);
                cartSummaryRepository.save(cartSummaryNew);
            } else {
                cartSummary.setSubtotal(subtotal);
                cartSummary.setDiscount(discount);
                cartSummary.setTax(tax);
                cartSummary.setTotal(total);
                cartSummaryRepository.save(cartSummary);
            }
        } catch (Exception e) {
            System.out.println("Error fetching cart summary: " + e.getMessage());
        }
        return "Cart summary updated successfully.";
    }

    @Override
    public CartSummaryProjection getCartSummary() {
        User user = authenticationService.getCurrenAuthenticatedUser();
        return cartSummaryRepository.findCartSummaryByUserId(user.getId())
                .orElseThrow(() -> new RuntimeException("No cart summary found"));
    }
}
