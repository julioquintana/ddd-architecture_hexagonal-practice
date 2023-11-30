package com.quintanasystem.architecturehexagonalpractice.infrastructure.db.springdata.repository;

import com.quintanasystem.architecturehexagonalpractice.infrastructure.db.springdata.dbo.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataUserRepository extends CrudRepository<UserEntity, Long> {
}
