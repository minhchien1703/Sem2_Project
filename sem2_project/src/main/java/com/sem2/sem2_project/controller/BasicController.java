package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.response.CategoryResponse;
import com.sem2.sem2_project.dto.response.ColorResponse;
import com.sem2.sem2_project.dto.response.MaterialResponse;
import com.sem2.sem2_project.dto.response.SizeResponse;
import com.sem2.sem2_project.service.ColorService;
import com.sem2.sem2_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/basic")
public class BasicController {
    private final ProductService productService;

    @GetMapping("/categories")
    public ResponseEntity<List<CategoryResponse>> getAllCategories() {
        return ResponseEntity.ok(productService.getCategories());
    }

    @GetMapping("/sizes")
    public ResponseEntity<List<SizeResponse>> getAllSizes() {
        return ResponseEntity.ok(productService.getSizes());
    }

    @GetMapping("colors")
    public ResponseEntity<List<ColorResponse>> getAllColors() {
        return ResponseEntity.ok(productService.getColors());
    }

    @GetMapping("/materials")
    public ResponseEntity<List<MaterialResponse>> getAllMaterials() {
        return ResponseEntity.ok(productService.getMaterials());
    }

}
