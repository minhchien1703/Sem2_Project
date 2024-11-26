package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.ProductRequest;
import com.sem2.sem2_project.dto.response.ProductResponse;
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

    @GetMapping("/limited")
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        Pageable pageable = PageRequest.of(0, 9);
        return ResponseEntity.ok(productService.getLimitedProducts(pageable));
    }


}
