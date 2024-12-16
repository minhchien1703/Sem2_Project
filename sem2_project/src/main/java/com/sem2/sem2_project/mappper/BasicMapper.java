package com.sem2.sem2_project.mappper;

import com.sem2.sem2_project.dto.request.*;
import com.sem2.sem2_project.dto.response.*;
import com.sem2.sem2_project.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;


@Mapper
public interface BasicMapper {
    BasicMapper INSTANCE = Mappers.getMapper(BasicMapper.class);

    //    user
    UserResponse mapToUserResponse(User user);

    User mapToUser(RegisterRequest request);

    //    categories
    CategoryResponse mapToCategoryResponse(Category category);

    Category mapToCategory(CategoryRequest categoryRequest);

    //    image
    Images toImageRequest(ImageRequest request);

    List<ImageResponse> toImageResponseList(List<Images> images);

    //    orders
    Order orderRequestToOrder(OrderRequest request);

    ProductResponse toProductResponse(Product product);

    //    product
    List<ProductResponse> toProductResponseList(List<Product> productList);

}
