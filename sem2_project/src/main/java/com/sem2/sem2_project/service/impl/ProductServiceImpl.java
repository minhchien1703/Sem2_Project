package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.ProductPriceRequest;
import com.sem2.sem2_project.dto.request.ProductRequest;
import com.sem2.sem2_project.dto.response.*;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.model.Color;
import com.sem2.sem2_project.model.enums.ProductStatus;
import com.sem2.sem2_project.repository.*;
import com.sem2.sem2_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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

        Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());
        product.setQuantity(productRequest.getQuantity());
        product.setWeight(productRequest.getWeight());
        product.setSale(productRequest.getSale());
        product.setType(productRequest.getType());
        product.setStatus(ProductStatus.AVAILABLE);
        product.setRating(5);
        product.setCategory(category);
        product.setMaterial(material);
        product.setRooms(rooms);
        Product productSaved = productRepository.save(product);

        for (Integer sId : productRequest.getSizeIds()) {
            Size size = sizeRepository.findById(sId)
                    .orElseThrow(() -> new RuntimeException("Size not found"));
            for (Integer cId : productRequest.getColorIds()) {
                Color color = colorRepository.findById(cId)
                        .orElseThrow(() -> new RuntimeException("Color not found with id: " + cId));

                Product productNew = new Product();
                productNew.setId(productSaved.getId());
                productNew.setName(productSaved.getName());
                productNew.setDescription(productSaved.getDescription());
                productNew.setPrice(productSaved.getPrice());
                productNew.setQuantity(productSaved.getQuantity());
                productNew.setWeight(productSaved.getWeight());
                productNew.setSale(productSaved.getSale());
                productNew.setType(productSaved.getType());
                productNew.setStatus(ProductStatus.AVAILABLE);
                productNew.setRating(5);
                productNew.setCategory(category);
                productNew.setMaterial(material);
                productNew.setRooms(rooms);
                productNew.setSize(size);
                productNew.setColor(color);
                productRepository.save(productNew);
            }
        }
        return "Product added successfully";
    }

    @Override
    public List<ProductResponse> getProductByTypePopular(String type, Pageable pageable) {
        List<Product> products = productRepository.findProductByPopular(type, pageable);
        List<ProductResponse> productResponses = BasicMapper.INSTANCE.toProductResponseList(products);

        for (ProductResponse productResponse : productResponses) {
            Images image = imageRepository.findImagesByProductId(productResponse.getId());
            if (image != null) {
                productResponse.setImage(image.getUrl());
            }
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
        Category category = categoryRepository.findByCategoryId(product.getCategory().getId());
        CategoryResponse categoryResponse = BasicMapper.INSTANCE.mapToCategoryResponse(category);
        List<Images> images = imageRepository.findImagesByProductIds(id);

        productResponse.setImages(BasicMapper.INSTANCE.toImageResponseList(images));
        productResponse.setColors(colorRepository.findByColorId(product.getColor().getId()));
        productResponse.setSizes(sizeRepository.findBySizeIds(product.getSize().getId()));
        productResponse.setCategories(categoryResponse);
        for (Images image : images) {
            if (image.getType() != null && image.getType().equals("AVATAR")) {
                productResponse.setImage(image.getUrl());
            }
        }
        return productResponse;
    }

    @Override
    public List<ProductResponse> getProductByRelated(int category) {
        List<Product> productList = productRepository.getProductsByCategory(category);
        List<ProductResponse> productResponses = BasicMapper.INSTANCE.toProductResponseList(productList);

        for (ProductResponse product : productResponses) {
            Images image = imageRepository.findImagesByProductId(product.getId());
            if (image != null) {
                product.setImage(image.getUrl());
            }
        }
        return productResponses;
    }

    @Override
    public List<ProductResponse> getProductPages(int page) {
        int limit = 5;
        int offset = (page - 1) * limit;
        List<Product> products = productRepository.getProductListProjection(limit, offset);
        List<ProductResponse> productResponses = BasicMapper.INSTANCE.toProductResponseList(products);

        for (ProductResponse product : productResponses) {
            Images image = imageRepository.findImagesByProductId(product.getId());
            if (image != null) {
                product.setImage(image.getUrl());
            }
        }
        return productResponses;
    }


}
