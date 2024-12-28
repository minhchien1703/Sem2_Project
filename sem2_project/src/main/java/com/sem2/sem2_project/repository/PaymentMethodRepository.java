package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<Payment, Integer> {
}
