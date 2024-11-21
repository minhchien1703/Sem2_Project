package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.ImageRequest;
import com.sem2.sem2_project.dto.response.ImageResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.Images;
import com.sem2.sem2_project.model.Product;
import com.sem2.sem2_project.repository.ImageRepository;
import com.sem2.sem2_project.repository.ProductRepository;
import com.sem2.sem2_project.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    private final ImageRepository imageRepository;
    private final ProductRepository productRepository;

    @Autowired
    public ImageServiceImpl(ImageRepository imageRepository, ProductRepository productRepository) {
        this.imageRepository = imageRepository;
        this.productRepository = productRepository;
    }

    @Override
    public ImageResponse addImage(ImageRequest imageRequest) {
        Product product = productRepository.findById(imageRequest.getProductId())
                .orElseThrow(()-> new RuntimeException("Product not found" + imageRequest.getProductId()));
        Images image = BasicMapper.INSTANCE.toImageRequest(imageRequest);
        image.setProduct(product);
        imageRepository.save(image);
        return BasicMapper.INSTANCE.toImage(image);
    }

    @Override
    public List<ImageResponse> getAllImages() {
        return List.of();
    }
}
