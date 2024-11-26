package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.CartRequest;
import com.sem2.sem2_project.dto.response.CartResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @PostMapping("/add")
    public ResponseEntity<CartResponse> addToCart(@RequestBody CartRequest cartRequest) {
        return ResponseEntity.ok(cartService.addToCart(cartRequest));
    }

    @GetMapping("/all")
    public ResponseEntity<List<CartResponse>> getAllCart() {
        return ResponseEntity.ok(cartService.getAllCartsByUserId());
    }

    @DeleteMapping("/del")
    public String delCart(@RequestParam int id) {
        return cartService.deleteCart(id);
    }
}
