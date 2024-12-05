package com.sem2.sem2_project.service.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.sem2.sem2_project.model.Images;
import com.sem2.sem2_project.model.Product;
import com.sem2.sem2_project.repository.ImageRepository;
import com.sem2.sem2_project.service.CloudinaryService;
import com.sem2.sem2_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CloudinaryServiceImpl implements CloudinaryService {
    private final Cloudinary cloudinary;
    private final ImageRepository imageRepository;
    private final ProductService productService;

    @Override
    public Map<String, String> uploadFile(MultipartFile file, int productId) throws IOException {
        Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
        Map<String, String> result = new HashMap<>();
        String url = uploadResult.get("url").toString();
        String publicId = uploadResult.get("public_id").toString();

        Product product = productService.findById(productId);

        Images image = new Images();
        image.setUrl(url);
        image.setPublicId(publicId);
        image.setProduct(product);
        imageRepository.save(image);
        result.put("url", url);
        result.put("public_id", publicId);
        return result;
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
