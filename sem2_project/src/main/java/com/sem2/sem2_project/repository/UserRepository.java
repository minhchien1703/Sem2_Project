package com.sem2.sem2_project.repository;

import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.repository.projection.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

    User findByUsername(String username);

    @Query("""
    select u from User u where u.phone = :phone
""")
    User findByPhone(@Param("phone") String phone);

    UserProjection findUserProjectionById(int id);
}
