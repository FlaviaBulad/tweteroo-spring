package com.tweteroo.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.model.SignUp;
import com.tweteroo.api.model.Tweet;
import com.tweteroo.api.repository.SignUpRepository;
import com.tweteroo.api.repository.TweetRepository;

@Service
public class TweetService {
    
    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private SignUpRepository signUpRepository;

    public void save(String username, TweetDTO dto) {
        Optional<SignUp> user = signUpRepository.findByUsername(username);

        if(user.isPresent()) {
            tweetRepository.save(new Tweet(dto, username, user.get().getAvatar()));
        }
    }

    public Page<Tweet> getTweets(Pageable page) {
        return tweetRepository.findAllByOrderByIdDesc(page);
    }

    public List<Tweet> getTweetsByUser(String username) {
        Optional<SignUp> user = signUpRepository.findByUsername(username);

        if(!user.isPresent()) return List.of();

        return tweetRepository.findAllByUsernameByIdDesc(username);
    }
}