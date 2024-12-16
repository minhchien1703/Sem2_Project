package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("""
                select c from Category c where c.id = :id
            """)
    Category findByCategoryId(int id);
}
