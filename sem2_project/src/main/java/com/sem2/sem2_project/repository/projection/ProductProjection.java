package com.sem2.sem2_project.repository.projection;

import com.sem2.sem2_project.model.enums.ProductStatus;

import java.awt.*;
import java.util.List;

public interface ProductProjection {
    int getId();
    String getName();
    double getRating();
    String getDescription();
    double getPrice();
    ProductStatus getStatus();
    int getSale();
}
