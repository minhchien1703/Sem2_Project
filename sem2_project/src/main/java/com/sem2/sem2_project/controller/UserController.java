package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.TokenRequest;
import com.sem2.sem2_project.dto.request.UserRequest;
import com.sem2.sem2_project.dto.response.UserResponse;
import com.sem2.sem2_project.service.AuthenticationService;
import com.sem2.sem2_project.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final AuthenticationService authenticationService;
    private final UserService userService;

    @PostMapping("/logout")
    public ResponseEntity<Boolean> logout(@RequestHeader("Authorization") String token) {
//        log.warn("Token: {}", token);
        String tokenWithoutBearer = token.replace("Bearer ", "");
        return ResponseEntity.ok(authenticationService.logout(tokenWithoutBearer));
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUser(@PathVariable int id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest) {
        return ResponseEntity.ok(userService.createUser(userRequest));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable int id, @RequestBody UserRequest userRequest) {
        return ResponseEntity.ok(userService.updateUser(id, userRequest));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

}
