package com.tweteroo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.repository.SignUpRepository;
import com.tweteroo.api.dto.SignUpDTO;
import com.tweteroo.api.model.SignUp;

@Service
public class SignUpService {
    
@Autowired
private SignUpRepository repository;

public void save(SignUpDTO req) {
    repository.save(new SignUp(req));
}
}
