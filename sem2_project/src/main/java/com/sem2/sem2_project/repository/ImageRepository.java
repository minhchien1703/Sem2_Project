package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
@Repository
public interface ImageRepository extends JpaRepository<Images, Integer> {
}
