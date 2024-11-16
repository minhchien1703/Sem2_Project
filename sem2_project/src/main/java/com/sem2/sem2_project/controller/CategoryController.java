package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.PropertyRequest;
import com.sem2.sem2_project.dto.response.PropertyResponse;
import com.sem2.sem2_project.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<PropertyResponse> saveCategory(@RequestBody PropertyRequest request){
        return ResponseEntity.ok(categoryService.saveCategory(request));
    }

    @PostMapping("/ok")
    public ResponseEntity<PropertyResponse> saveC1ategory(@RequestBody PropertyRequest request){
        return ResponseEntity.ok(categoryService.saveCategory(request));
    }
}
