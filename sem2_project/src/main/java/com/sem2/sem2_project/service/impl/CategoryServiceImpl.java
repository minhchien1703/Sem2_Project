package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.CategoryRequest;
import com.sem2.sem2_project.dto.response.CategoryResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.Category;
import com.sem2.sem2_project.repository.CategoryRepository;
import com.sem2.sem2_project.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public String saveCategory(CategoryRequest request) {
        Category category = BasicMapper.INSTANCE.mapToCategory(request);
        categoryRepository.save(category);
        return "Save category successful";
    }

    @Override
    public String deleteCategory(int id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Category not found"));
        categoryRepository.delete(category);
        return "Category deleted";
    }


}
