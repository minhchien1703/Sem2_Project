package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.ImageRequest;
import com.sem2.sem2_project.dto.response.ImageResponse;

import java.util.List;

public interface ImageService {
    ImageResponse addImage(ImageRequest imageRequest);

    List<ImageResponse> getAllImages();
}
