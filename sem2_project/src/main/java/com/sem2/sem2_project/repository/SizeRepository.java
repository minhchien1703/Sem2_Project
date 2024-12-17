package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SizeRepository extends JpaRepository<Size, Integer> {
    Size findByName(String name);

    @Query("""
                select s from Size s where s.id = :id
            """)
    List<Size> findBySizeIds(@Param("id") Integer id);
}
