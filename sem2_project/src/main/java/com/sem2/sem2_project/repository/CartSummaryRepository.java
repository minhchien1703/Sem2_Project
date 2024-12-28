package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.CartSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CartSummaryRepository extends JpaRepository<CartSummary, Integer> {

    @Query("""
    select cs from CartSummary cs where cs.order.id = :orderId and cs.user.id = :userId
""")
    CartSummary findByOrderAndUserId(Integer orderId, Integer userId);
}
