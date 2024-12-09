package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.CartRequest;
import com.sem2.sem2_project.dto.response.CartResponse;
import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.repository.UserRepository;
import com.sem2.sem2_project.repository.projection.CartProjection;
import com.sem2.sem2_project.service.AuthenticationService;
import com.sem2.sem2_project.service.CartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
@Slf4j
public class CartController {
    private final CartService cartService;
    private final AuthenticationService authenticationService;
    private final UserRepository userRepository;

    @PostMapping("/add/{userId}")
    public ResponseEntity<String> addToCart(@PathVariable int userId, @RequestBody CartRequest cartRequest) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return ResponseEntity.ok(cartService.addToCart(cartRequest, user));
    }

    @GetMapping("/all")
    public ResponseEntity<List<CartResponse>> getAllCart() {
        return ResponseEntity.ok(cartService.getAllCartsByUserId());
    }

    @DeleteMapping("/del")
    public ResponseEntity<String> delCart(@RequestParam(required = false) Integer id) {
        return ResponseEntity.ok(cartService.deleteProductFromCart(id));
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateCart(@RequestBody CartRequest cartRequest) {
        System.out.println(cartRequest.getProductId());
        return ResponseEntity.ok(cartService.updateCartItemQuantity(cartRequest));
    }

}
