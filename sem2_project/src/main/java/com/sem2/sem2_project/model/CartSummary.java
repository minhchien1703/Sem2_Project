package com.sem2.sem2_project.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "cart_summary")
public class CartSummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @Column(name = "subtotal")
    private double subtotal;
    private double discount;
    private double tax;
    private double total;
}
