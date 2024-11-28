package com.sem2.sem2_project.dto.response;

import com.sem2.sem2_project.model.Order;
import com.sem2.sem2_project.model.Product;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class OrderDetailsResponse {
    private int id;
    private String productName;
    private String productDescription;
    private int quantity;
    private double price;
}
