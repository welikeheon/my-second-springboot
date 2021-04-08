package com.c11.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
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
}
