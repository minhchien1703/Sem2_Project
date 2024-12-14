package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.CategoryRequest;
import com.sem2.sem2_project.dto.response.CategoryResponse;
import com.sem2.sem2_project.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping("/save")
    public String saveCategory(@RequestBody CategoryRequest request){
        return categoryService.saveCategory(request);
    }

    @DeleteMapping("/del")
    public String deleteCategory(@RequestParam int id){
        return categoryService.deleteCategory(id);
    }

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> getAllCategory(){
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

}
