package com.quintanasystem.architecturehexagonalpractice.domain.repository;

import com.quintanasystem.architecturehexagonalpractice.domain.User;

public interface UserRepository {
    User findById(Long id);

    User save(User user);
}
