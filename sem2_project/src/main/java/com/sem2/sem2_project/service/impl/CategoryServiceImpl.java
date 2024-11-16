package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.PropertyRequest;
import com.sem2.sem2_project.dto.response.PropertyResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.Categories;
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
        Categories categories = BasicMapper.INSTANCE.toCategoryRequest(request);
        categoryRepository.save(categories);
        return BasicMapper.INSTANCE.toCategory(categories);
    }
}
