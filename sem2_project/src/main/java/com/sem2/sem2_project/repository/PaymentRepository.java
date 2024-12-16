package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.Payment;
import com.sem2.sem2_project.repository.projection.PaymentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    @Query("""
                select p from Payment p
            """)
    List<PaymentProjection> findAllPayments();
}
