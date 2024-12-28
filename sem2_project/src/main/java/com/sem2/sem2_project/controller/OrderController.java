package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.OrderDetailSummaryRequest;
import com.sem2.sem2_project.dto.request.OrderUpdateStatusRequest;
import com.sem2.sem2_project.dto.request.OrderRequest;
import com.sem2.sem2_project.dto.response.CartResponse;
import com.sem2.sem2_project.dto.response.OrderDetailsResponse;
import com.sem2.sem2_project.dto.response.OrderResponse;
import com.sem2.sem2_project.model.Payment;
import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.repository.projection.PaymentProjection;
import com.sem2.sem2_project.repository.projection.UserProjection;
import com.sem2.sem2_project.service.CartService;
import com.sem2.sem2_project.service.EmailService;
import com.sem2.sem2_project.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<String> createOrder(@RequestBody OrderRequest orderRequest) {
        return ResponseEntity.ok(orderService.createOrder(orderRequest));
    }

    @PutMapping("/update")
    public ResponseEntity<Boolean> updateOrder(@RequestParam int id, @RequestBody OrderUpdateStatusRequest orderRequest) {
        return ResponseEntity.ok(orderService.updateOrder(id, orderRequest));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> deleteOrder(@RequestParam int id) {
        return ResponseEntity.ok(orderService.deleteOrder(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<OrderResponse>> getAllOrders() {
        return ResponseEntity.ok(orderService.getOrderByUserId());
    }

    @GetMapping("/getUser/{userId}")
    public ResponseEntity<UserProjection> checkoutOrder(@PathVariable int userId) {
        return ResponseEntity.ok(orderService.getInfoUser(userId));
    }

    @GetMapping("/payments")
    public ResponseEntity<List<PaymentProjection>> getPayments() {
        return ResponseEntity.ok(orderService.getInfoPayments());
    }

    @PostMapping("/orderDetails")
    public ResponseEntity<OrderDetailsResponse> getCartByUserId(@RequestBody OrderDetailSummaryRequest request) {
        return ResponseEntity.ok(orderService.orderDetails(request.getOrderId(), request.getUserId()));
    }

}

