package com.sem2.sem2_project.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {
    private int userId;
    private double totalAmount;
    private String shippingAddress;
    private int paymentMethodId;
    private int statusId;
    private List<ProductOrderRequest> productOrderRequests;

}
