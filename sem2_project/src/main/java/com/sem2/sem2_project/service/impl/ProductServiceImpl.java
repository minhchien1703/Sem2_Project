package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.ProductPriceRequest;
import com.sem2.sem2_project.dto.request.ProductRequest;
import com.sem2.sem2_project.dto.response.ColorResponse;
import com.sem2.sem2_project.dto.response.ImageResponse;
import com.sem2.sem2_project.dto.response.ProductResponse;
import com.sem2.sem2_project.dto.response.SizeResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.model.Color;
import com.sem2.sem2_project.model.enums.ProductStatus;
import com.sem2.sem2_project.repository.*;
import com.sem2.sem2_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final MaterialRepository materialRepository;
    private final RoomRepository roomRepository;
    private final ImageRepository imageRepository;
    private final SizeRepository sizeRepository;
    private final ColorRepository colorRepository;

    @Override
    public String addProduct(ProductRequest productRequest) {
        Category category = categoryRepository.findById(productRequest.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        Material material = materialRepository.findById(productRequest.getMaterialId())
                .orElseThrow(() -> new RuntimeException("Material not found"));

        Set<Room> rooms = productRequest.getRoomsIds().stream()
                .map(id -> roomRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Room not found with id: " + id)))
                .collect(Collectors.toSet());

        Size size = sizeRepository.findByName(productRequest.getSize());
        if (size == null) {
            size = new Size();
            size.setName(productRequest.getSize());
            sizeRepository.save(size);
        }

        Color color = colorRepository.findByName(productRequest.getColor());
        if (color == null) {
            color = new Color();
            color.setName(productRequest.getColor());
            color.setHexCode(productRequest.getColor());
            colorRepository.save(color);
        }


        Product product = BasicMapper.INSTANCE.toProduct(productRequest);
        product.setColor(color);
        product.setSize(size);
        product.setRating(5);
        product.setCategory(category);
        product.setMaterial(material);
        product.setStatus(ProductStatus.AVAILABLE);
        product.setRooms(rooms);
        productRepository.save(product);
        return "Product added successfully";
    }

    @Override
    public List<ProductResponse> getProductByTypePopular(String type, Pageable pageable) {
        List<Product> products = productRepository.findProductByPopular(type, pageable);
        List<ProductResponse> productResponses = BasicMapper.INSTANCE.toProductResponseList(products);

        for (ProductResponse productResponse : productResponses) {
            List<Images> images = imageRepository.findImagesByProductId(productResponse.getId());
            for (Images image : images) {
                if (image.getType() != null && image.getType().equals("AVATAR")) {
                    productResponse.setImage(image.getUrl());
                }
            }
            productResponse.setColors(BasicMapper.INSTANCE.toColorResponse(colorRepository.findById(productResponse.getColors().getId())));
            productResponse.setSizes(BasicMapper.INSTANCE.toSizeResponse(sizeRepository.findById(productResponse.getSizes().getId())));
        }
        return productResponses;
    }

    @Override
    public String updateProduct(int id, ProductRequest productRequest) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

        Category category = categoryRepository.findById(productRequest.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        Material material = materialRepository.findById(productRequest.getMaterialId())
                .orElseThrow(() -> new RuntimeException("Material not found"));

        Set<Room> rooms = productRequest.getRoomsIds().stream()
                .map(roomId -> roomRepository.findById(roomId)
                        .orElseThrow(() -> new RuntimeException("Room not found id: " + roomId)))
                .collect(Collectors.toSet());

        product.setDescription(productRequest.getDescription());
        product.setStatus(productRequest.getStatus());
        product.setSale(productRequest.getSale());
        product.setPrice(productRequest.getPrice());
        product.setWeight(productRequest.getWeight());
        product.setQuantity(productRequest.getQuantity());
        product.setMaterial(material);
        product.setCategory(category);
        product.setRooms(rooms);
        productRepository.save(product);
        return "Product updated successfully";
    }

    @Override
    public List<ProductResponse> getProductByPrice(ProductPriceRequest priceRequest) {
        List<Product> productList = productRepository.findProductByPrice(priceRequest.getFirstPrice(), priceRequest.getLastPrice());
        return BasicMapper.INSTANCE.toProductResponseList(productList);
    }

    @Override
    public ProductResponse findById(int id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
        ProductResponse productResponse = BasicMapper.INSTANCE.toProductResponse(product);
        List<Images> images = imageRepository.findImagesByProductId(id);
        productResponse.setImages(BasicMapper.INSTANCE.toImageResponseList(images));
        for (Images image : images) {
            if (image.getType() != null && image.getType().equals("AVATAR")) {
                productResponse.setImage(image.getUrl());
            }
        }
        return productResponse;
    }


}
