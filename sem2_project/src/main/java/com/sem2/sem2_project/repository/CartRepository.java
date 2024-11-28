package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.Cart;
import com.sem2.sem2_project.model.enums.Status;
import com.sem2.sem2_project.repository.projection.CartProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    @Query("""
            SELECT c FROM Cart c
            WHERE c.product.id = :productId
            AND c.user.id = :userId
            """)
    Cart findCartByProductIdAndUserId(@Param("productId") int productId,
                                      @Param("userId") int userId);

    @Query("""
            SELECT c FROM Cart c
            WHERE c.user.id = :userId
            AND c.status = :status
            """)
    List<CartProjection> findCartByUserId(@Param("userId") int userId,
                                          @Param("status") Status status);

    @Modifying
    @Query("""
            delete FROM Cart c WHERE c.product.id = :productId
            """)
    void deleteCartByProductId(@Param("productId") int productId);
}
