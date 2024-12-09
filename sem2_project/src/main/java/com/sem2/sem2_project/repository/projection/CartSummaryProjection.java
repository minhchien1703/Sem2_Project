package com.sem2.sem2_project.repository.projection;

public interface CartSummaryProjection {
    int getId();
    int getUserId();
    double getSubtotal();
    double getDiscount();
    double getTax();
    double getTotal();
}
