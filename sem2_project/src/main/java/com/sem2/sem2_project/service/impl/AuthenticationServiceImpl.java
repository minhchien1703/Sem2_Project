package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.config.jwt.JwtProvider;
import com.sem2.sem2_project.dto.request.LoginRequest;
import com.sem2.sem2_project.dto.request.RegisterRequest;
import com.sem2.sem2_project.dto.response.UserResponse;
import com.sem2.sem2_project.dto.response.LoginResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.LoggedOutToken;
import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.repository.LoggedOutTokenRepository;
import com.sem2.sem2_project.repository.UserRepository;
import com.sem2.sem2_project.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final AuthenticationManager authenticationManager;
    private final JwtProvider jwtProvider;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final LoggedOutTokenRepository loggedOutTokenRepository;

    @Override
    public LoginResponse login(LoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        User user = userRepository.findByUsername(request.getUsername());
        String token = jwtProvider.generateToken(authentication);
        UserResponse userResponse = BasicMapper.INSTANCE.mapToUserRequest(user);
        return new LoginResponse(userResponse, token);
    }

    @Override
    public UserResponse register(RegisterRequest request) {
        User user = BasicMapper.INSTANCE.mapToUser(request);
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        User savedUser = userRepository.save(user);
        return BasicMapper.INSTANCE.mapToUserRequest(savedUser);
    }

    @Override
    public void logout(String token) {
        if (loggedOutTokenRepository.findByToken(token).isPresent()) {
            throw new IllegalStateException("Token is already logged out");
        }

        LoggedOutToken loggedOutToken = new LoggedOutToken();
        loggedOutToken.setToken(token);
        loggedOutTokenRepository.save(loggedOutToken);
    }


}
