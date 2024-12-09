package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.CartRequest;
import com.sem2.sem2_project.dto.response.CartResponse;
import com.sem2.sem2_project.model.User;

import java.util.List;

public interface CartService {
    String addToCart(CartRequest cartRequest, User user);

    List<CartResponse> getAllCartsByUserId();

    String deleteProductFromCart(int productId);

    String updateCartItemQuantity(CartRequest cartRequest);
}
