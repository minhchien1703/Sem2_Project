package com.sem2.sem2_project.dto.request;

import com.sem2.sem2_project.model.Status;
import com.sem2.sem2_project.model.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
public class OrderRequest {
    private int id;
    private int userId;

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
