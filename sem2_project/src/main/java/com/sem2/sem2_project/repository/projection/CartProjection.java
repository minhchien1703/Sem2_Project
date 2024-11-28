package com.sem2.sem2_project.repository.projection;

public interface CartProjection {
    int getId();
    ProductInfoProjection getProduct();
    int getQuantity();

    interface ProductInfoProjection {
        String getImageUrl();
        String getName();
        double getPrice();
        ColorInfo getColor();
        String getStatus();

        interface ColorInfo {
            int getId();
            String getName();
        }
    }

}
