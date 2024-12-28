package com.sem2.sem2_project.service.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.sem2.sem2_project.model.Images;
import com.sem2.sem2_project.model.Product;
import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.repository.ImageRepository;
import com.sem2.sem2_project.repository.ProductRepository;
import com.sem2.sem2_project.repository.UserRepository;
import com.sem2.sem2_project.service.CloudinaryService;
import lombok.RequiredArgsConstructor;
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
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    @Override
    public Map<String, String> uploadProductImages(MultipartFile file, int productId) throws IOException {
        Map uploadResult = cloudinary.uploader().upload(file.getBytes(),
                ObjectUtils.asMap("folder", "sem2/product_images"));
        Map<String, String> result = new HashMap<>();
        String url = uploadResult.get("url").toString();
        String publicId = uploadResult.get("public_id").toString();

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Not found product with id: " + productId));
        Images image = new Images();
        image.setUrl(url);
        image.setPublicId(publicId);
        image.setProduct(product);
        imageRepository.save(image);
        result.put("url", url);
        result.put("public_id", publicId);
        return result;
    }

    @Override
    public Map<String, String> uploadUserImage(MultipartFile file, int userId) throws IOException {
        Map uploadResult = cloudinary.uploader().upload(file.getBytes(),
                ObjectUtils.asMap("folder", "sem2/user_images"));

        String url = uploadResult.get("url").toString();
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Not found user with id: " + userId));

        Map<String, String> result = new HashMap<>();
        if (url != null) {
            user.setUserImage(url);
            userRepository.save(user);
            result.put("message", "Upload image successful.");
            result.put("url", url);
            return result;
        }
        result.put("message", "Upload image for user error!" );
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
