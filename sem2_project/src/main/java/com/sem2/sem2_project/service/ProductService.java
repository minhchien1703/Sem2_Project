package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.ProductPriceRequest;
import com.sem2.sem2_project.dto.request.ProductRequest;
import com.sem2.sem2_project.dto.response.ProductResponse;
import com.sem2.sem2_project.model.Product;

import java.util.List;

public interface ProductService {
    String addProduct(ProductRequest product);

    List<Product> getProductForHome();

    String updateProduct(int id, ProductRequest product);

    List<ProductResponse> getProductByPrice(ProductPriceRequest productPriceRequest);

    Product findById(int id);
}
