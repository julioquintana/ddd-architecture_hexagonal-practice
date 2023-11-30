package com.quintanasystem.architecturehexagonalpractice.application.repository;

import com.quintanasystem.architecturehexagonalpractice.domain.User;

public interface UserRepository {
    User findById(Long id);

    User save(User user);
}
