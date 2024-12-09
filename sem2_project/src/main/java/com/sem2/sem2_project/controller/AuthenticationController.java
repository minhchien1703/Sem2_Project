package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.LoginRequest;
import com.sem2.sem2_project.dto.request.RegisterRequest;
import com.sem2.sem2_project.dto.response.LoginResponse;
import com.sem2.sem2_project.dto.response.UserResponse;
import com.sem2.sem2_project.service.AuthenticationService;
import com.sem2.sem2_project.valid.ValidationError;
import com.sem2.sem2_project.valid.ValidationException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.bind.validation.ValidationErrors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/public")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authenticationService.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        try {
            return ResponseEntity.ok(authenticationService.register(request));
        } catch (ValidationException ex) {
            return ResponseEntity.badRequest().body(Map.of("errors", ex.getErrors()));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred");
        }
    }
}
