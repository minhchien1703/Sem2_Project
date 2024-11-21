package com.sem2.sem2_project.mappper;

import com.sem2.sem2_project.dto.request.*;
import com.sem2.sem2_project.dto.response.*;
import com.sem2.sem2_project.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BasicMapper {
    BasicMapper INSTANCE = Mappers.getMapper(BasicMapper.class);

    //    user
    UserResponse mapToUserRequest(User user);

    User mapToUser(RegisterRequest request);

    //    categories
    PropertyResponse toCategory(Category category);

    Category toCategoryRequest(PropertyRequest request);

    //    image
    Images toImageRequest(ImageRequest request);

    ImageResponse toImage(Images images);

    //    orders
    Order toOrderRequest(OrderRequest request);


//    orderDetails
    OrderDetails toOrderDetails(OrderDetailsRequest request);

    OrderDetailsResponse toOrderDetailsResponse(OrderDetails orderDetails);

}
