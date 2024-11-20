package com.sem2.sem2_project.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @CreationTimestamp
    @JoinColumn(name = "created_at")
    private LocalDateTime date;

    private double totalAmount;
    private String shippingAddress;

    @JoinColumn(name = "payment_info")
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
}
