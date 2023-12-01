package com.quintanasystem.architecturehexagonalpractice.application.service;

import com.quintanasystem.architecturehexagonalpractice.domain.repository.UserRepository;
import com.quintanasystem.architecturehexagonalpractice.domain.User;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id) {

        return userRepository.findById(id);
    }

    public User saveUser(User user) {

        return userRepository.save(user);


    }
}