package com.sem2.sem2_project.mappper;

import com.sem2.sem2_project.dto.request.ImageRequest;
import com.sem2.sem2_project.dto.request.PropertyRequest;
import com.sem2.sem2_project.dto.request.RegisterRequest;
import com.sem2.sem2_project.dto.response.ImageResponse;
import com.sem2.sem2_project.dto.response.UserResponse;
import com.sem2.sem2_project.dto.response.PropertyResponse;
import com.sem2.sem2_project.model.Categories;
import com.sem2.sem2_project.model.Images;
import com.sem2.sem2_project.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BasicMapper {
    BasicMapper INSTANCE = Mappers.getMapper(BasicMapper.class);

    //    user
    UserResponse mapToUserRequest(User user);

    User mapToUser(RegisterRequest request);

    //    categories
    PropertyResponse toCategory(Categories categories);

    Categories toCategoryRequest(PropertyRequest request);

    //    image
    Images toImageRequest(ImageRequest request);

    ImageResponse toImage(Images images);


}
