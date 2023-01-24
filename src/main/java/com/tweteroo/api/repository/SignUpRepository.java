package com.tweteroo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.model.SignUp;

public interface SignUpRepository extends JpaRepository<SignUp, Long> {
    SignUp findByUsername(String username);  
}
