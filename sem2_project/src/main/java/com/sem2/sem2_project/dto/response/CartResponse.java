package com.sem2.sem2_project.dto.response;

import com.sem2.sem2_project.model.Product;
import com.sem2.sem2_project.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
public class CartResponse {
    private int userId;
    private int productId;
    private String productName;
    private int quantity;
    private double price;
    private double totalPrice;
}
