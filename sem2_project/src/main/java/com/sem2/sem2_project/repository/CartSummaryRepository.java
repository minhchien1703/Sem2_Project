package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.CartSummary;
import com.sem2.sem2_project.repository.projection.CartSummaryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartSummaryRepository extends JpaRepository<CartSummary, Integer> {
    @Query("SELECT cs.id AS id, cs.user.id AS userId, cs.subtotal AS subtotal, cs.discount AS discount, " +
            "cs.tax AS tax, cs.total AS total " +
            "FROM CartSummary cs WHERE cs.user.id = :userId")
    Optional<CartSummaryProjection> findCartSummaryByUserId(@Param("userId") int userId);

    @Query("SELECT cs FROM CartSummary cs WHERE cs.user.id = :userId")
    CartSummary findCartSummaryByUser(@Param("userId") int userId);
}
