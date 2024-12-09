package com.sem2.sem2_project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "cart_summary")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private double subtotal;
    private double discount;
    private double tax;
    private double total;
}
