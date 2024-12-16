package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.ProductPriceRequest;
import com.sem2.sem2_project.dto.request.ProductRequest;
import com.sem2.sem2_project.dto.response.ProductResponse;
import com.sem2.sem2_project.model.enums.TypeProducts;
import com.sem2.sem2_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    private final ProductService productService;

    @PostMapping("/add")
    public String addProduct(@RequestBody ProductRequest productRequest) {
//        log.info("Add category: {}", productRequest.getCategoryId());
        return productService.addProduct(productRequest);
    }

    @GetMapping("/popular")
    public ResponseEntity<List<ProductResponse>> getAllProducts(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "limit", defaultValue = "5") int limit
    ) {
        Pageable pageable = PageRequest.of(page, limit);
        String type = TypeProducts.POPULAR.name();
        return ResponseEntity.ok(productService.getProductByTypePopular(type, pageable));
    }

    @GetMapping("/getByPrice")
    public ResponseEntity<List<ProductResponse>> getProductsByPrice(@RequestBody ProductPriceRequest request) {
        return ResponseEntity.ok(productService.getProductByPrice(request));
    }

    @GetMapping("/single/{productId}")
    public ResponseEntity<ProductResponse> singleProduct(@PathVariable("productId") int productId) {
        return ResponseEntity.ok(productService.findById(productId));
    }

    @GetMapping("/related/{categoryId}")
    public ResponseEntity<List<ProductResponse>> getRelatedProducts(@PathVariable("categoryId") Integer categoryId) {
        return ResponseEntity.ok(productService.getProductByRelated(categoryId));
    }

    @GetMapping("/page/{page}")
    public ResponseEntity<List<ProductResponse>> getProductsByPage(@PathVariable("page") int page) {
        return ResponseEntity.ok(productService.getProductPages(page));
    }

}
