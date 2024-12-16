package com.sem2.sem2_project.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

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
//    //    add relational with orderDetails
//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
//    private List<OrderDetails> orderDetails;
    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    private double totalAmount;
    private String shippingAddress;
    @OneToOne
    @JoinColumn(name = "payment_method_id")
    private Payment payment;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
    @Column(name = "message")
    private String message;
}
