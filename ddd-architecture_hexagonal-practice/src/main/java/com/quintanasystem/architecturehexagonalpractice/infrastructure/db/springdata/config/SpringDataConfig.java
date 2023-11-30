package com.quintanasystem.architecturehexagonalpractice.infrastructure.db.springdata.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@Getter
@Setter
@Configuration
@EnableJpaAuditing
@NoArgsConstructor
@EntityScan(basePackages = {"com.quintanasystem.architecturehexagonalpractice.infrastructure",
        "com.quintanasystem.architecturehexagonalpractice.infrastructure.db.springdata.mapper"})
@EnableJpaRepositories(
        basePackages = "com.quintanasystem.architecturehexagonalpractice.infrastructure.db.springdata.repository")
@ConfigurationProperties("spring.datasource")
public class SpringDataConfig {
}
