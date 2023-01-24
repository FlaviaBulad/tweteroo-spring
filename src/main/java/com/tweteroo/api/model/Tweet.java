package com.tweteroo.api.model;

import com.tweteroo.api.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Tweet {
    
    public Tweet(TweetDTO data, String username, String avatar) {
        this.text = data.text();
        this.username = username;
        this.avatar = avatar;
    }

  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 280, nullable = false)
    private String text;

    @Column(length = 50, nullable = false)
    private String username;

    @Column(nullable = false)
    private String avatar;
}
