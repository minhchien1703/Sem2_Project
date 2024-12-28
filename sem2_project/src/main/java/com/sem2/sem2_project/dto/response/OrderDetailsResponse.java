package com.sem2.sem2_project.dto.response;

import com.sem2.sem2_project.model.Order;
import com.sem2.sem2_project.model.Product;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDetailsResponse {
    private int orderId;
    private String shippingAddress;
    private String paymentName;
    private List<CartResponse> orderDetails;
}
