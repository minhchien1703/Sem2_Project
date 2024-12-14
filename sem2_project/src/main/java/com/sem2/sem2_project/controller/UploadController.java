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

    @PostMapping("/upload")
    public ResponseEntity<List<Map<String, String>>> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        List<Map<String, String>> uploadResults = new ArrayList<>();
        for (MultipartFile file : files) {
            try {
                Map<String, String> result = cloudinaryService.uploadFile(file);
                uploadResults.add(result);
            } catch (IOException e) {
                return ResponseEntity.status(500).body(null);
            }
        }
        return ResponseEntity.ok(uploadResults);
    }

    // Delete file by publicId
    @DeleteMapping("/delete/{publicId}")
    public ResponseEntity<String> deleteFile(@PathVariable String publicId) {
        try {
            return ResponseEntity.ok(cloudinaryService.deleteFile(publicId));
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Error deleting file");
        }
    }



}
