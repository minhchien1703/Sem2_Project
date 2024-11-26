package com.sem2.sem2_project.dto.request;

import lombok.Data;

@Data
public class ProductOrderRequest {
    private int id;
    private int productId;
    private int quantity;
    private double price;
}
