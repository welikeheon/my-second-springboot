package com.c11.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 선언된 모든 필드의 get 메소드를 생성해줌
@RequiredArgsConstructor // 선언된 모든 `final` 필드가 포함된 생성자를 생성해줌.
public class HelloResponseDto {
    // RequiredArgsConstructor 은 final 필드가 포함되지 않은 것은 생성하지 않음
    private final String name;
    private final int amount;

}
