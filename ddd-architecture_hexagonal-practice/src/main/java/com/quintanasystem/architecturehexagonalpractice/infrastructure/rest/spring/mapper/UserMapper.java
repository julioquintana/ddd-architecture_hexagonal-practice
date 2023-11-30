package com.quintanasystem.architecturehexagonalpractice.infrastructure.rest.spring.mapper;

import com.quintanasystem.architecturehexagonalpractice.domain.User;
import com.quintanasystem.architecturehexagonalpractice.infrastructure.rest.spring.dto.UserDto;

public interface UserMapper {

    UserDto toDto (User user);

    User toDomain(UserDto userDto);
}