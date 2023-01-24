package com.tweteroo.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.model.SignUp;

public interface SignUpRepository extends JpaRepository<SignUp, Long> {
    Optional<SignUp> findByUsername(String username);  
}
