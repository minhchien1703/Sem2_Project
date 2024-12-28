package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.response.SummaryResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.model.enums.CartStatus;
import com.sem2.sem2_project.repository.CartRepository;
import com.sem2.sem2_project.repository.CartSummaryRepository;
import com.sem2.sem2_project.repository.OrderRepository;
import com.sem2.sem2_project.service.CartSummaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartSummaryServiceImpl implements CartSummaryService {
    private final CartRepository cartRepository;
    private final CartSummaryRepository cartSummaryRepository;
    private final OrderRepository orderRepository;

    @Override
    public SummaryResponse updateCartSummary(int userId) {
        List<Cart> carts = cartRepository.findCartByUserId(userId, CartStatus.ACTIVE);

        SummaryResponse summaryResponse = new SummaryResponse();
        if (carts.isEmpty()) {
            summaryResponse.setSubtotal(0);
            summaryResponse.setSubtotal(0);
            summaryResponse.setTax(0);
            summaryResponse.setTotal(0);
            return summaryResponse;
        }

        double subtotal = carts.stream()
                .mapToDouble(cart -> cart.getProduct().getPrice() * cart.getQuantity())
                .sum();
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

        summaryResponse.setSubtotal(Math.round(subtotal * 10.0) / 10.0);
        summaryResponse.setDiscount(Math.round(discount * 10.0) / 10.0);
        summaryResponse.setTax(Math.round(tax * 10.0) / 10.0);
        summaryResponse.setTotal(Math.round(total * 10.0) / 10.0);
        return summaryResponse;
    }

    @Override
    public CartSummary createCartSummary(int orderId, int userId) {
        List<Cart> carts = cartRepository.findCartByUserId(userId, CartStatus.ACTIVE);

        double subtotal = carts.stream()
                .mapToDouble(cart -> cart.getProduct().getPrice() * cart.getQuantity())
                .sum();
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

        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        CartSummary cartSummary = new CartSummary();
        cartSummary.setOrder(order);
        cartSummary.setUser(order.getUser());
        cartSummary.setSubtotal(Math.round(subtotal * 10.0) / 10.0);
        cartSummary.setDiscount(Math.round(discount * 10.0) / 10.0);
        cartSummary.setTax(Math.round(tax * 10.0) / 10.0);
        cartSummary.setTotal(Math.round(total * 10.0) / 10.0);
        cartSummaryRepository.save(cartSummary);
        return cartSummary;
    }

    @Override
    public SummaryResponse getCartSummary(int orderId, int userId) {
        CartSummary cartSummary = cartSummaryRepository.findByOrderAndUserId(orderId, userId);
        return BasicMapper.INSTANCE.toSummaryResponse(cartSummary);
    }
}
