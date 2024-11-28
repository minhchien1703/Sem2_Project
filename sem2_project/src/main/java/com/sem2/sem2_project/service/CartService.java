package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.CartRequest;
import com.sem2.sem2_project.repository.projection.CartProjection;

import java.util.List;

public interface CartService {
    String addToCart(CartRequest cartRequest);

    List<CartProjection> getAllCartsByUserId();

    String deleteProductFromCart(int productId);
}
