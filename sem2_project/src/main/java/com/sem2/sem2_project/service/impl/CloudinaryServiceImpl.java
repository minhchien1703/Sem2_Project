package com.sem2.sem2_project.service.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.sem2.sem2_project.model.Images;
import com.sem2.sem2_project.model.Product;
import com.sem2.sem2_project.repository.ImageRepository;
import com.sem2.sem2_project.service.CloudinaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CloudinaryServiceImpl implements CloudinaryService {
    private final Cloudinary cloudinary;
    private final ImageRepository imageRepository;

    @Override
    public Map<String, String> uploadFile(MultipartFile file) throws IOException {
        Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
        Map<String, String> result = new HashMap<>();
        String url = uploadResult.get("url").toString();
        String publicId = uploadResult.get("public_id").toString();
        Images image = new Images();
        image.setUrl(url);
        image.setPublicId(publicId);
        imageRepository.save(image);
        result.put("url", url);
        result.put("public_id", publicId);
        return result;
    }

    @Override
    public List<Images> uploadFiles(List<MultipartFile> files) throws IOException {
            List<Images> images = new ArrayList<>();
        if (files == null) {
            return null;
        }
        for (MultipartFile file : files) {
            Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
            String url = uploadResult.get("url").toString();
            String publicId = uploadResult.get("public_id").toString();
            Images image = new Images();
            image.setUrl(url);
            image.setPublicId(publicId);
            imageRepository.save(image);
            images.add(image);
        }
        return images;

    }



    @Transactional
    @Override
    public String deleteFile(String publicId) throws IOException {
        Map result = cloudinary.uploader().destroy(publicId, ObjectUtils.emptyMap());

        if (result.get("result").toString().equals("ok")) {
            imageRepository.delImageByPublicId(publicId);
        }

        return result.get("result").toString();
    }




}
