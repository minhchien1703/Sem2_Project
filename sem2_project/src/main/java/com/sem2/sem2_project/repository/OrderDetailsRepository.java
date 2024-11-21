package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
//    @Query("""
//                SELECT od FROM OrderDetails od WHERE od.order.id = :order_id
//            """)
    List<OrderDetails> findByOrderId(int orderId);
}
