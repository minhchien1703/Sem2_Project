package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.LoginRequest;
import com.sem2.sem2_project.dto.request.RegisterRequest;
import com.sem2.sem2_project.dto.response.LoginResponse;
import com.sem2.sem2_project.dto.response.UserResponse;
import com.sem2.sem2_project.service.AuthenticationService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(authenticationService.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authenticationService.register(request));
    }
}
