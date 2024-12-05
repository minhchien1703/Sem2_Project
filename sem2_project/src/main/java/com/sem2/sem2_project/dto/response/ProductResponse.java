package com.sem2.sem2_project.dto.response;

import com.sem2.sem2_project.model.Category;
import com.sem2.sem2_project.model.Color;
import com.sem2.sem2_project.model.Material;
import com.sem2.sem2_project.model.Product;
import com.sem2.sem2_project.model.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
public class ProductResponse {
    private int id;
    private String name;
    private double price;
    private double rating;
    private String description;
    private ProductStatus status;
    private int sale;
}
