package com.quintanasystem.architecturehexagonalpractice.infrastructure.rest.spring.mapper;

import com.quintanasystem.architecturehexagonalpractice.domain.User;
import com.quintanasystem.architecturehexagonalpractice.infrastructure.rest.spring.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserDto toDto(User user) {
        return new UserDto(user.getId(), user.getName(), user.getAddress());
    }

    @Override
    public User toDomain(UserDto userDto) {
        return new User(userDto.getId(), userDto.getName(), userDto.getAddress());
    }
}
