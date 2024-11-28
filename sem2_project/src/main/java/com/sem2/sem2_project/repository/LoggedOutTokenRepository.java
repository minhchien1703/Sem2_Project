package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.dto.request.TokenRequest;
import com.sem2.sem2_project.model.LoggedOutToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface LoggedOutTokenRepository extends JpaRepository<LoggedOutToken, Long> {
    Optional<LoggedOutToken> findByToken(String token);
}
