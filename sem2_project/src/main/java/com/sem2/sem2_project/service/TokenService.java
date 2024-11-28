package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.TokenRequest;

public interface TokenService {
    boolean isTokenBlacklisted (String token);
}
