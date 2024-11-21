package com.sem2.sem2_project.model;

import com.sem2.sem2_project.dto.response.UserResponse;
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

    @Transient
    private UserResponse userResponse;

    //    add relational with orderDetails
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime date;

    private double totalAmount;
    private String shippingAddress;

    @Column(name = "payment_info")
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
}
