package com.quintanasystem.architecturehexagonalpractice.infrastructure.config.spring;

import com.quintanasystem.architecturehexagonalpractice.application.repository.UserRepository;
import com.quintanasystem.architecturehexagonalpractice.application.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootServiceConfig {
    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }

}
