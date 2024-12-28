package com.sem2.sem2_project.dto.response;

import com.sem2.sem2_project.model.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class SummaryResponse {
    private double subtotal;
    private double discount;
    private double tax;
    private double total;
}
