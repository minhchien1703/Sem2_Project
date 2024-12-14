package com.sem2.sem2_project.mappper;

import com.sem2.sem2_project.dto.request.UserRequest;
import com.sem2.sem2_project.dto.response.UserResponse;
import com.sem2.sem2_project.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserResponse toUserResponse(User user);

    @Mapping(target ="password", ignore = true)
    User toUser(UserRequest userRequest);

    @Mapping(target = "password",ignore = true)
    void updateUserFromDto(UserRequest userRequest, @MappingTarget User user);



}
