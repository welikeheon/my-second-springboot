package com.c11.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    // 머스테치 스타터로 인해 문자열 반환할 때 앞의 경로와 뒤의 파일 확장자가 자동으로 지정됨.
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
