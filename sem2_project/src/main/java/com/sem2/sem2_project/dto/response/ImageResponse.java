package com.sem2.sem2_project.dto.response;

import com.sem2.sem2_project.model.Product;
import lombok.Data;

@Data
public class ImageResponse {
    private int id;
    private String url;
    private String type;
}
