package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.config.jwt.JwtProvider;
import com.sem2.sem2_project.dto.request.CartRequest;
import com.sem2.sem2_project.dto.response.CartResponse;
import com.sem2.sem2_project.model.Cart;
import com.sem2.sem2_project.model.Product;
import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.model.enums.CartStatus;
import com.sem2.sem2_project.repository.CartRepository;
import com.sem2.sem2_project.repository.ProductRepository;
import com.sem2.sem2_project.repository.UserRepository;
import com.sem2.sem2_project.repository.projection.CartProjection;
import com.sem2.sem2_project.service.AuthenticationService;
import com.sem2.sem2_project.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final ProductRepository productRepository;
    private final AuthenticationService authenticationService;

    @Override
    public String addToCart(CartRequest request, User user) {
        Product product = productRepository.findById(request.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        Cart cart = cartRepository.findCartByProductIdAndUserId(product.getId(), user.getId());
        if (cart != null) {
            cart.setQuantity(cart.getQuantity() + request.getQuantity());
        }else {
            cart = new Cart();
            cart.setUser(user);
            cart.setProduct(product);
            cart.setStatus(CartStatus.ACTIVE);
            if (request.getQuantity() > 0) {
                cart.setQuantity(request.getQuantity());
            }else {
                cart.setQuantity(1);
            }
        }
        cartRepository.save(cart);
        return "Cart successfully added to the cart";
    }

    @Override
    public List<CartProjection> getAllCartsByUserId() {
        User user = authenticationService.getCurrenAuthenticatedUser();
        System.out.println(user.getId());
        return cartRepository.findCartByUserId(user.getId(), CartStatus.ACTIVE);
    }

    @Transactional
    @Override
    public String deleteProductFromCart(int cartId) {
        cartRepository.deleteById(cartId);
        return "Delete cart successfully";
    }


}
