package com.c11.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        // given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        // assertj: 테스트 검증라이브러리의 검증 메소드, 검증 대상을 메소드 인자로 받고 메소드 체이닝 지원으로 isEqualTo 처럼 이어서 사용가능..
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
