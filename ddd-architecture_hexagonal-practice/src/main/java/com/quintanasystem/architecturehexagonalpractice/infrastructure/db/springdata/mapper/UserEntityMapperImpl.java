package com.quintanasystem.architecturehexagonalpractice.infrastructure.db.springdata.mapper;

import com.quintanasystem.architecturehexagonalpractice.domain.User;
import com.quintanasystem.architecturehexagonalpractice.infrastructure.db.springdata.dbo.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserEntityMapperImpl implements  UserEntityMapper{
    @Override
    public User toDomain(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getName(), userEntity.getAddress());
    }

    @Override
    public UserEntity toDbo(User user) {
        return new UserEntity(user.getId(),user.getName(), user.getAddress());
    }
}
