package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.OrderDetailsRequest;
import com.sem2.sem2_project.dto.response.OrderDetailsResponse;
import com.sem2.sem2_project.service.OrderDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orderDetails")
public class OrderDetailsController {
    private final OrderDetailsService orderDetailsService;

    @PostMapping("/add")
    public ResponseEntity<OrderDetailsResponse> addOrderDetail(@RequestBody OrderDetailsRequest orderDetailsRequest) {
        return ResponseEntity.ok(orderDetailsService.addOrderDetails(orderDetailsRequest));
    }
}
