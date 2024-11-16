package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.PropertyRequest;
import com.sem2.sem2_project.dto.response.PropertyResponse;

public interface CategoryService {
    PropertyResponse saveCategory(PropertyRequest request);
}
