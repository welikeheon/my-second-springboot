package com.c11.springboot.web;

import com.c11.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController 어노테이션은 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줌.
 */
@RestController
public class HelloController {
    // GetMapping: Get요청을 받을 수 있는 API로 만들어 줌
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    // RequestParam Annotation은 외부에서 api로 넘긴 파라미터를 가져오는 어노테이션,
    // 여기에선 외부에서 name (@RequestParam("name")) 이란 이름으로 넘긴 파라미터를 메소드 파라미터 name 에 저장함..
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
