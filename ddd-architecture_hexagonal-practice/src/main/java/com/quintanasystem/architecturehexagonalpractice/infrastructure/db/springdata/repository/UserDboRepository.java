package com.quintanasystem.architecturehexagonalpractice.infrastructure.db.springdata.repository;

import com.quintanasystem.architecturehexagonalpractice.domain.repository.UserRepository;
import com.quintanasystem.architecturehexagonalpractice.domain.User;
import com.quintanasystem.architecturehexagonalpractice.infrastructure.db.springdata.mapper.UserEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDboRepository implements UserRepository {
    private final SpringDataUserRepository userRepository;
    private final UserEntityMapper userMapper;


    @Override
    public User findById(Long id) {
        return userMapper.toDomain(userRepository.findById(id).orElseThrow());
    }

    @Override
    public User save(User user) {
        return userMapper.toDomain(userRepository.save(userMapper.toDbo(user)));
    }
}
