package com.sem2.sem2_project.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public interface CloudinaryService {
    Map<String, String> uploadFile(MultipartFile file, int productId) throws IOException;

    String deleteFile(String publicId) throws IOException;
}
