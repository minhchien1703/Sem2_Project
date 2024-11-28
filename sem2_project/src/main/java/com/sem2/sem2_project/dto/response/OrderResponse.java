package com.sem2.sem2_project.dto.response;

import com.sem2.sem2_project.model.Status;
import com.sem2.sem2_project.model.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderResponse {
    private int id;
    private int userId;
    private String userName;
    private LocalDateTime date;
    private double totalAmount;
    private String shippingAddress;
    private String paymentName;
    private String status;
    private List<OrderDetailsResponse> orderDetails;
}
