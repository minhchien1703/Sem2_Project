package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.LoggedOutToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoggedOutTokenRepository extends JpaRepository<LoggedOutToken, Long> {
    Optional<LoggedOutToken> findByToken(String token);
}
