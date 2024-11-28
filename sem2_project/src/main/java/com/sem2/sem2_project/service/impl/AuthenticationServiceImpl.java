package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.config.jwt.JwtProvider;
import com.sem2.sem2_project.dto.request.LoginRequest;
import com.sem2.sem2_project.dto.request.RegisterRequest;
import com.sem2.sem2_project.dto.response.UserResponse;
import com.sem2.sem2_project.dto.response.LoginResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.LoggedOutToken;
import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.model.enums.Roles;
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
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtProvider.generateToken(authentication);

        User user = userRepository.findByEmail(request.getEmail()).orElseThrow(
                () -> new RuntimeException("Email not found" + request.getEmail()));
        UserResponse userResponse = BasicMapper.INSTANCE.mapToUserResponse(user);
        userResponse.setUsername(user.getUsername());
        return new LoginResponse(userResponse, token);
    }

    @Override
    public UserResponse register(RegisterRequest request) {
        User user = BasicMapper.INSTANCE.mapToUser(request);
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        user.setRole(Roles.USER);

        User savedUser = userRepository.save(user);

        UserResponse userResponse = BasicMapper.INSTANCE.mapToUserResponse(savedUser);
        userResponse.setUsername(user.getUsername());
        return userResponse;
    }

    @Override
    public boolean logout(String token) {
        if (loggedOutTokenRepository.findByToken(token).isPresent()) {
            throw new IllegalStateException("Token is already logged out");
        }

        LoggedOutToken loggedOutToken = new LoggedOutToken();
        loggedOutToken.setToken(token);
        loggedOutTokenRepository.save(loggedOutToken);
        return true;
    }

    @Override
    public User getCurrenAuthenticatedUser() {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        return userRepository.findByUsername(authentication.getName());
    }


}
