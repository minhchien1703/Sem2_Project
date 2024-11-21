package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.PropertyRequest;
import com.sem2.sem2_project.dto.response.PropertyResponse;
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
    public PropertyResponse saveCategory(PropertyRequest request) {
        Category category = BasicMapper.INSTANCE.toCategoryRequest(request);
        categoryRepository.save(category);
        return BasicMapper.INSTANCE.toCategory(category);
    }
}
