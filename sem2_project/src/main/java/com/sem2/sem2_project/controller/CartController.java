package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.CartRequest;
import com.sem2.sem2_project.dto.request.OrderDetailSummaryRequest;
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
import java.util.Map;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
@Slf4j
public class CartController {
    private final CartService cartService;
    private final AuthenticationService authenticationService;
    private final UserRepository userRepository;

    @PostMapping("/add")
    public ResponseEntity<?> addToCartByProduct(@RequestBody CartRequest cartRequest) {
        try{
            User user = authenticationService.getCurrenAuthenticatedUser();
            String responseMessage = cartService.addToCart(cartRequest, user);
            return ResponseEntity.ok().body(Map.of("message", responseMessage));
        } catch (RuntimeException error) {
            return ResponseEntity.badRequest().body(Map.of("error", error.getMessage()));
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<CartResponse>> getAllCart() {
        return ResponseEntity.ok(cartService.getAllCartsByUserId());
    }

    @DeleteMapping("/del")
    public ResponseEntity<String> delCart(@RequestBody CartRequest cartRequest) {
        return ResponseEntity.ok(cartService.deleteProductFromCart(cartRequest.getProductId(), cartRequest.getUserId()));
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateCart(@RequestBody CartRequest cartRequest) {
        System.out.println(cartRequest.getProductId());
        return ResponseEntity.ok(cartService.updateCartItemQuantity(cartRequest));
    }


}
