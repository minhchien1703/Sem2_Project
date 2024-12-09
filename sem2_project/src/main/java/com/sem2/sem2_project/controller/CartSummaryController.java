package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.model.CartSummary;
import com.sem2.sem2_project.repository.projection.CartSummaryProjection;
import com.sem2.sem2_project.service.CartSummaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/summary")
@RequiredArgsConstructor
public class CartSummaryController {
    private final CartSummaryService cartSummaryService;

    @PutMapping("/update")
    public ResponseEntity<String> displayCartSummary() {
        return ResponseEntity.ok(cartSummaryService.updateCartSummary());
    }

    @GetMapping("/show")
    public ResponseEntity<CartSummaryProjection> showCartSummary() {
        return ResponseEntity.ok(cartSummaryService.getCartSummary());
    }
}
