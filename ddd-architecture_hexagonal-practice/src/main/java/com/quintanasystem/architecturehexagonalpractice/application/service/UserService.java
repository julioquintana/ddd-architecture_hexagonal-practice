package com.quintanasystem.architecturehexagonalpractice.application.service;

import com.quintanasystem.architecturehexagonalpractice.application.repository.UserRepository;
import com.quintanasystem.architecturehexagonalpractice.domain.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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