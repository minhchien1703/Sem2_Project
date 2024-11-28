package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.TokenRequest;
import com.sem2.sem2_project.repository.LoggedOutTokenRepository;
import com.sem2.sem2_project.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TokenServiceImpl implements TokenService {
    private final LoggedOutTokenRepository loggedOutTokenRepository;

    @Override
    public boolean isTokenBlacklisted(String token) {
        return loggedOutTokenRepository.findByToken(token).isPresent();
    }

}
