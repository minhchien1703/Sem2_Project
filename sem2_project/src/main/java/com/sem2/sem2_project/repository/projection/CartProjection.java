package com.sem2.sem2_project.repository.projection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sem2.sem2_project.model.Images;

import java.util.List;

public interface CartProjection {
    int getId();
    ProductInfoProjection getProduct();
    int getQuantity();

    interface ProductInfoProjection {
        int getId();
        String getName();
        double getPrice();
        ColorInfo getColor();
        String getStatus();
        String getDescription();
        int getSale();
        String getImageUrl();



        interface ColorInfo {
            int getId();
            String getName();
        }
    }

}
