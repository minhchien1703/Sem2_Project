package com.sem2.sem2_project.mappper;

import com.sem2.sem2_project.dto.request.PropertyRequest;
import com.sem2.sem2_project.dto.request.RegisterRequest;
import com.sem2.sem2_project.dto.response.UserResponse;
import com.sem2.sem2_project.dto.response.PropertyResponse;
import com.sem2.sem2_project.model.Categories;
import com.sem2.sem2_project.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BasicMapper {
    BasicMapper INSTANCE = Mappers.getMapper(BasicMapper.class);

    UserResponse mapToUserRequest(User user);

    Categories toCategoryRequest(PropertyRequest request);

    PropertyResponse toCategory(Categories categories);

    User mapToUser(RegisterRequest request);

}
