package com.sem2.sem2_project.dto.request;

import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.model.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class ProductRequest {
    private String name;
    private String description;
    private int categoryId;
    private double price;
    private int quantity;
    private double weight;
    private int materialId;
    private ProductStatus status;
    private int sale;
    private String size;
    private String color;
    private String hexCode;
    private List<Integer> roomsIds;
}
