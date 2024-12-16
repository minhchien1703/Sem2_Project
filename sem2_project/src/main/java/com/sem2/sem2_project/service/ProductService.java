package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.ProductPriceRequest;
import com.sem2.sem2_project.dto.request.ProductRequest;
import com.sem2.sem2_project.dto.response.ProductResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    String addProduct(ProductRequest product);

    List<ProductResponse> getProductByTypePopular(String type, Pageable pageable);

    String updateProduct(int id, ProductRequest product);

    List<ProductResponse> getProductByPrice(ProductPriceRequest productPriceRequest);

    ProductResponse findById(int id);

    List<ProductResponse> getProductByRelated(int category);

    List<ProductResponse> getProductPages(int limit);

}
