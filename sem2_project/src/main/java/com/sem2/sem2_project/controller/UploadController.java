package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.service.CloudinaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/file")
@RequiredArgsConstructor
public class UploadController {
    private final CloudinaryService cloudinaryService;

    @PostMapping("/products/{productId}")
    public ResponseEntity<List<Map<String, String>>> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files, @PathVariable("productId") int productId) {
        List<Map<String, String>> uploadResults = new ArrayList<>();
        for (MultipartFile file : files) {
            try {
                Map<String, String> result = cloudinaryService.uploadProductImages(file, productId);
                uploadResults.add(result);
            } catch (IOException e) {
                return ResponseEntity.status(500).body(null);
            }
        }
        return ResponseEntity.ok(uploadResults);
    }

    @PostMapping("/users/{userId}")
    public ResponseEntity<Map<String, String>> uploadImage(@RequestParam("file") MultipartFile file, @PathVariable("userId") int userId) {
        try {
            Map<String, String> uploadResults = cloudinaryService.uploadUserImage(file, userId);
            return ResponseEntity.ok(uploadResults);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }

    @DeleteMapping("/delete/{publicId}")
    public ResponseEntity<String> deleteFile(@PathVariable String publicId) {
        try {
            return ResponseEntity.ok(cloudinaryService.deleteFile(publicId));
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Error deleting file");
        }
    }


}
