package com.quintanasystem.architecturehexagonalpractice.infrastructure.db.springdata.mapper;

import com.quintanasystem.architecturehexagonalpractice.domain.User;
import com.quintanasystem.architecturehexagonalpractice.infrastructure.db.springdata.dbo.UserEntity;

public interface UserEntityMapper {
    User toDomain(UserEntity userEntity);

    UserEntity toDbo(User user);
}
