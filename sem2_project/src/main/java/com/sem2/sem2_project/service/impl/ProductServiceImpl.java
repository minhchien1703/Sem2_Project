package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.ProductPriceRequest;
import com.sem2.sem2_project.dto.request.ProductRequest;
import com.sem2.sem2_project.dto.response.ProductResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.model.enums.ProductStatus;
import com.sem2.sem2_project.repository.*;
import com.sem2.sem2_project.service.ProductService;
import lombok.RequiredArgsConstructor;
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
    private final ColorRepository colorRepository;
    private final RoomRepository roomRepository;
    private final ImageRepository imageRepository;

    @Override
    public String addProduct(ProductRequest productRequest) {
        Category category = categoryRepository.findById(productRequest.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        Material material = materialRepository.findById(productRequest.getMaterialId())
                .orElseThrow(() -> new RuntimeException("Material not found"));

        Color color = colorRepository.findById(productRequest.getColorId())
                .orElseThrow(() -> new RuntimeException("Color not found"));

        Set<Room> rooms = productRequest.getRoomsIds().stream()
                .map(id -> roomRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Room not found with id: " + id)))
                .collect(Collectors.toSet());

        Product product = BasicMapper.INSTANCE.toProduct(productRequest);
        product.setRating(5);
        product.setCategory(category);
        product.setMaterial(material);
        product.setColor(color);
        product.setStatus(ProductStatus.AVAILABLE);
        product.setRooms(rooms);
        productRepository.save(product);
        return "Product added successfully";
    }

    @Override
    public List<Product> getProductForHome() {
        return productRepository.getLimitedProducts();
    }

    @Override
    public String updateProduct(int id, ProductRequest productRequest) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

        Set<Room> rooms = productRequest.getRoomsIds().stream()
                .map(roomId -> roomRepository.findById(roomId)
                        .orElseThrow(() -> new RuntimeException("Room not found id: " + roomId)))
                .collect(Collectors.toSet());

        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());
        product.setQuantity(productRequest.getQuantity());
        product.setWeight(productRequest.getWeight());
        product.setSize(productRequest.getSize());
        product.setSale(productRequest.getSale());
        product.setStatus(productRequest.getStatus());
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
    public Product findById(int id) {
        return productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found with id: " + id));
    }


}
