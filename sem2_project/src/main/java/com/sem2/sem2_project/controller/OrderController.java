package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.OrderRequest;
import com.sem2.sem2_project.dto.response.OrderResponse;
import com.sem2.sem2_project.model.Order;
import com.sem2.sem2_project.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest) {
        return ResponseEntity.ok(orderService.createOrder(orderRequest));
    }

    @PutMapping("/update")
    public ResponseEntity<OrderResponse> updateOrder(@RequestParam int id, @RequestBody OrderRequest orderRequest) {
        return ResponseEntity.ok(orderService.updateOrder(id, orderRequest));
    }

    @DeleteMapping("/delete")
    public boolean deleteOrder(@RequestParam int id) {
        return orderService.deleteOrder(id);
    }

    @GetMapping("/all")
    public ResponseEntity<List<OrderResponse>> getAllOrders() {
        return ResponseEntity.ok(orderService.getAllOrders());
    }

}
