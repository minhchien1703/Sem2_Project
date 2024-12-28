package com.sem2.sem2_project.dto.response;

import com.sem2.sem2_project.model.Color;
import com.sem2.sem2_project.model.Product;
import com.sem2.sem2_project.model.Size;
import com.sem2.sem2_project.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CartResponse {
    private int id;
    private ProductResponse product;
    private int quantity;
    private Color color;
    private Size size;
    private double subTotal;

}
