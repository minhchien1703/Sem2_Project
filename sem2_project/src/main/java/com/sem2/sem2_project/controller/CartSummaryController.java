package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.OrderDetailSummaryRequest;
import com.sem2.sem2_project.dto.response.SummaryResponse;
import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.service.CartSummaryService;
import com.sem2.sem2_project.service.impl.AuthenticationServiceImpl;
import com.sem2.sem2_project.service.impl.CartSummaryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/summary")
@RequiredArgsConstructor
public class CartSummaryController {
    private final CartSummaryService cartSummaryService;

    @PostMapping("/get/{userId}")
    public ResponseEntity<SummaryResponse> updateCartSummary(@PathVariable("userId") int userId) {
        return ResponseEntity.ok(cartSummaryService.updateCartSummary(userId));
    }

    @PostMapping("/orderDetail")
    public ResponseEntity<SummaryResponse> getOrderDetailSummary(@RequestBody OrderDetailSummaryRequest request) {
        return ResponseEntity.ok(cartSummaryService.getCartSummary(request.getOrderId(), request.getUserId()));
    }
}
