package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.response.SummaryResponse;
import com.sem2.sem2_project.model.CartSummary;

public interface CartSummaryService {
    SummaryResponse updateCartSummary(int user);
    CartSummary createCartSummary(int orderId, int user);
    SummaryResponse getCartSummary(int orderId, int userId);
}
