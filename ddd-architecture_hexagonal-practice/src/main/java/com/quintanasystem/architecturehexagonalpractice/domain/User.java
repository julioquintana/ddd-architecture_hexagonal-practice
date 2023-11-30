package com.quintanasystem.architecturehexagonalpractice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {

    private Long id;

    private String name;

    private String address;
}