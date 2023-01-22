package com.tweteroo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.SignUpDTO;
import com.tweteroo.api.model.SignUp;
import com.tweteroo.api.repository.SignUpRepository;

@RestController
@RequestMapping("/api/sign-up")
public class SignUpController {

    @Autowired
    private SignUpRepository repository;

    @GetMapping
    public List<SignUp> listAll() {
        return repository.findAll();
    }

    @PostMapping
    public void Create(@RequestBody SignUpDTO req) {
        System.out.println(req);
        repository.save(new SignUp(req));
    }
}
