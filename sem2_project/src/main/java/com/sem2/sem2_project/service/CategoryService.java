package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.CategoryRequest;
import com.sem2.sem2_project.dto.response.CategoryResponse;

import java.util.List;

public interface CategoryService {
    String saveCategory(CategoryRequest request);

    String deleteCategory(int id);

    List<CategoryResponse> getAllCategories();
}
