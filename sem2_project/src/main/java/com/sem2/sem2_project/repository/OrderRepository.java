package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Query("""
    select o from Order o where o.user.id = :userId order by o.id desc
""")
    List<Order> findByUserId(@Param("userId") Integer userId);

    @Query("""
    select o from Order o where o.id = :orderId and o.user.id = :userId
""")
    Order findByOrderAndUserId(@Param("orderId") Integer orderId, @Param("userId") Integer userId);
}
