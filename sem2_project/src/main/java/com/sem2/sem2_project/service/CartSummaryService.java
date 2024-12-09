package com.sem2.sem2_project.service;

import com.sem2.sem2_project.model.CartSummary;
import com.sem2.sem2_project.repository.projection.CartSummaryProjection;

public interface CartSummaryService {
    String updateCartSummary();
    CartSummaryProjection getCartSummary();

}
