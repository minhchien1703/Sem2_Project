package com.sem2.sem2_project.config.jwt;

import com.sem2.sem2_project.model.LoggedOutToken;
import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.repository.LoggedOutTokenRepository;
import io.jsonwebtoken.*;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class JwtProvider {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private long expiration;

    private final LoggedOutTokenRepository loggedOutTokenRepository;

    public String generateToken(Authentication authentication) {
        Map<String, Object> map = new HashMap<>();
        map.put("roles", authentication.getAuthorities());

        User user = (User) authentication.getPrincipal();

        return Jwts.builder()
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .setSubject(user.getUsername())
                .addClaims(map)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }

    public String getUsernameFormToken(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }


}
