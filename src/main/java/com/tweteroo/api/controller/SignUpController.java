package com.tweteroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.SignUpDTO;
import com.tweteroo.api.service.SignUpService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/sign-up")
public class SignUpController {

    @Autowired
    private SignUpService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody @Valid SignUpDTO req) {
        System.out.println(req);
        service.save(req);
        return ResponseEntity.ok().body("OK");
    }
}