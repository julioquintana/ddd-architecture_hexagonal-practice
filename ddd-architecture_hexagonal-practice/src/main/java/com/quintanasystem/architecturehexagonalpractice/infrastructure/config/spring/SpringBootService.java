package com.quintanasystem.architecturehexagonalpractice.infrastructure.config.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.quintanasystem.architecturehexagonalpractice.infrastructure")
@EntityScan(basePackages = "com.quintanasystem.architecturehexagonalpractice.domain")
public class SpringBootService {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootService.class, args);
	}

}
