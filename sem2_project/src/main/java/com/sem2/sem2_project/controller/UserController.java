package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.TokenRequest;
import com.sem2.sem2_project.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final AuthenticationService authenticationService;

    @PostMapping("/logout")
    public ResponseEntity<Boolean> logout(@RequestHeader("Authorization") String token) {
//        log.warn("Token: {}", token);
        String tokenWithoutBearer = token.replace("Bearer ", "");
        return ResponseEntity.ok(authenticationService.logout(tokenWithoutBearer));
    }


}
