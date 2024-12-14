package com.sem2.sem2_project.dto.request;

import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.model.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ProductRequest {
    private String name;
    private String description;
    private int categoryId;
    private double price;
    private int quantity;
    private double weight;
    private ProductStatus status;
    private String type;
    private int sizeId;
    private int colorId;
    private int materialId;
    private List<Images> images;
    private List<Integer> roomsIds;
}
