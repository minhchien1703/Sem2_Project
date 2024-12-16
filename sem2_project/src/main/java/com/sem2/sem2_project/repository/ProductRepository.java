package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

//    @Query(value = "select p.*, i.url from products p join images i on p.id = i.product_id order by p.id desc ", nativeQuery = true)
//    List<Product> getLimitedProducts();

    @Query("""
            SELECT p FROM Product p WHERE p.price BETWEEN :firstPrice AND :lastPrice
            """)
    List<Product> findProductByPrice(
            @Param("firstPrice") double firstPrice,
            @Param("lastPrice") double lastPrice);

    @Query(value = """
                SELECT p FROM Product p WHERE p.type = :type
            """)
    List<Product> findProductByPopular(@Param("type") String type, Pageable pageable);

    @Query("""
                    Select p FROM Product p WHERE p.id = :productId and p.color.id = :colorId and p.size.id = :sizeId
            """)
    Product findByProductIdColorIdSizeId(Integer productId, Integer colorId, Integer sizeId);

    @Query(value = """
                select * FROM products  WHERE category_id = :categoryId limit 4  
            """, nativeQuery = true)
    List<Product> getProductsByCategory(@Param("categoryId") Integer categoryId);

    @Query(value = """
                SELECT * 
                FROM products 
                LIMIT :limit OFFSET :offset
            """, nativeQuery = true)
    List<Product> getProductListProjection(@Param("limit") Integer limit, @Param("offset") Integer offset);
}
