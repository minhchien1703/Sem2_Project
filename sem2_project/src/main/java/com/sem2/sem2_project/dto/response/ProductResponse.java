package com.sem2.sem2_project.dto.response;

import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.model.Color;
import com.sem2.sem2_project.model.enums.ProductStatus;
import com.sem2.sem2_project.repository.projection.ImageProjection;
import jakarta.persistence.*;
import lombok.Data;

import java.awt.*;
import java.util.List;
import java.util.Set;

@Data
public class ProductResponse {
    private int id;
    private String name;
    private double price;
    private double rating;
    private String description;
    private int sale;
    private int quantity;
    private String image;
    private ProductStatus status;
    private CategoryResponse categories;
    private List<Size> sizes;
    private List<Color> colors;
    private List<ImageResponse> images;
}
