package com.sem2.sem2_project.dto.request;

import lombok.Data;

@Data
public class OrderDetailsRequest {
    private int orderId;
    private int productId;
    private int quantity;
    private double price;
}
