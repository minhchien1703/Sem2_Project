package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.UserRequest;
import com.sem2.sem2_project.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    public UserResponse createUser(UserRequest userRequest);
    public UserResponse updateUser(int id, UserRequest userRequest);
    public void deleteUser(int id);
    public UserResponse getUserById(int id);
    public List<UserResponse> getAllUsers();
    public UserResponse getUserByKeyword(String keyword);
}
