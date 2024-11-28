package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.ImageRequest;
import com.sem2.sem2_project.dto.response.ImageResponse;
import com.sem2.sem2_project.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/image")
@RequiredArgsConstructor
public class ImageController {
    private final ImageService imageService;

    @PostMapping("/add")
    public ResponseEntity<ImageResponse> addImage(@RequestBody ImageRequest request) {
        return ResponseEntity.ok(imageService.addImage(request));
    }
}
