package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ColorRepository extends JpaRepository<Color, Integer> {
    Color findByName(String name);

    @Query("""
                select c from Color c where c.id = :id
            """)
    List<Color> findByColorId(@Param("id") Integer id);
}
