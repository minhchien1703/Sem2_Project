package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.ProductPriceRequest;
import com.sem2.sem2_project.dto.request.ProductRequest;
import com.sem2.sem2_project.dto.response.*;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    ProductResponse addProduct(ProductRequest product);

    List<ProductResponse> getProductByTypePopular(String type, Pageable pageable);

    ProductResponse getProductById(int id);

    ProductResponse updateProduct(int id, ProductRequest product);

    void deleteProduct(int id);

    List<ProductResponse> getProductByPrice(ProductPriceRequest productPriceRequest);

    ProductResponse findById(int id);

    List<ProductResponse> getProductByCategory(int categoryId);

    List<ProductResponse> getProductByRoomId(int roomId);

    List<ProductResponse> getProducts();

    List<SizeResponse> getSizes();

    List<CategoryResponse> getCategories();

    List<ColorResponse> getColors();

    List<MaterialResponse> getMaterials();

    List<ProductResponse> getProductByRelated(int category);

    List<ProductResponse> getProductPages(int limit);

}
