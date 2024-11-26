package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.ProductRequest;
import com.sem2.sem2_project.dto.response.ProductResponse;
import com.sem2.sem2_project.model.Product;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    String addProduct(ProductRequest product);

    List<ProductResponse> getLimitedProducts(Pageable pageable);

    String updateProduct(int id, ProductRequest product);
}
