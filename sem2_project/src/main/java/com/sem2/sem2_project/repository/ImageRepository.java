package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Images, Integer> {
    @Query("""
            DELETE FROM Images i WHERE i.publicId = :publicId
            """)
    void delImageByPublicId(@Param("publicId") String publicId);

}
