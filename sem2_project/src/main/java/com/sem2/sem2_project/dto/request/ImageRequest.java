package com.sem2.sem2_project.dto.request;

import lombok.Data;

@Data
public class ImageRequest {
    private int productId;
    private String url;
    private String imageName;
}
