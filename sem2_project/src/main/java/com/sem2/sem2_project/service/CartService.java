package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.CartRequest;
import com.sem2.sem2_project.dto.response.CartResponse;

import java.util.List;

public interface CartService {
    CartResponse addToCart(CartRequest cartRequest);

    List<CartResponse> getAllCartsByUserId();

    boolean updateCart(CartRequest cart);

    String deleteCart(int id);
}
