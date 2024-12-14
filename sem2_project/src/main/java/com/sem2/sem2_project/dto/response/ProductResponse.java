package com.sem2.sem2_project.dto.response;

import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.model.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class ProductResponse {
    private int id;
    private String name;
    private String description;
    private Category category;
    private double price;
    private int quantity;
    private double weight;
    private ProductStatus status;
    private double rating;
    private int sale;
    private String type;
    private Size size;
    private Color color;
    private Material material;
    private List<Images> images;
    private Set<Room> rooms;



}
