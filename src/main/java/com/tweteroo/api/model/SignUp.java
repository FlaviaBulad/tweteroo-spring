package com.tweteroo.api.model;

import com.tweteroo.api.dto.SignUpDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class SignUp {

    public SignUp(SignUpDTO data) {
        this.username = data.username();
        this.avatar = data.avatar();
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 50, nullable = false)
    private String username;

    @Column(nullable = false)
    private String avatar;

    public boolean isPresent() {
        return false;
    }
    
}
