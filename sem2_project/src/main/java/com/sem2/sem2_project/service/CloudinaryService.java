package com.sem2.sem2_project.service;

import com.sem2.sem2_project.model.Images;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface CloudinaryService {
    Map<String, String> uploadFile(MultipartFile file) throws IOException;

    String deleteFile(String publicId) throws IOException;

    List<Images> uploadFiles(List<MultipartFile> files) throws IOException;
}
