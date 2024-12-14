package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.UserRequest;
import com.sem2.sem2_project.dto.response.UserResponse;
import com.sem2.sem2_project.mappper.UserMapper;
import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.repository.UserRepository;
import com.sem2.sem2_project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public UserResponse createUser(UserRequest userRequest) {
        User user = UserMapper.INSTANCE.toUser(userRequest);
        userRepository.save(user);
        return UserMapper.INSTANCE.toUserResponse(user);
    }

    @Override
    public UserResponse updateUser(int id, UserRequest userRequest) {
        User dbUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found" ));
        UserMapper.INSTANCE.updateUserFromDto(userRequest, dbUser);
        userRepository.save(dbUser);
        return UserMapper.INSTANCE.toUserResponse(dbUser);
    }

    @Override
    public void deleteUser(int id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found" ));
        userRepository.delete(user);
    }

    @Override
    public UserResponse getUserById(int id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found" ));
        UserResponse userResponse = UserMapper.INSTANCE.toUserResponse(user);
        return userResponse;
    }

    @Override
    public List<UserResponse> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserResponse> userResponses = new ArrayList<>();
        for (User user : users) {
            UserResponse userResponse = UserMapper.INSTANCE.toUserResponse(user);
            userResponses.add(userResponse);
        }
        return userResponses;
    }

    @Override
    public UserResponse getUserByKeyword(String keyword) {
        return null;
     }


}
