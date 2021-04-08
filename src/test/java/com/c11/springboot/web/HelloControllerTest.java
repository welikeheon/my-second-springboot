package com.c11.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// 테스트를 진행할 때 JUnit에 내장된 실행자가 아닌 SpringRunner라는 스프링 실행자를 사용함, 스프링부트 테스트와 JUnit간의 연결자 역할..
@RunWith(SpringRunner.class)
// 스프링 테스트 어노테이션 중 WEB(Spring MVC)에 집중할 수 있는 어노테이션..
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    // 스프링이 관리하는 빈을 주입받음
    @Autowired
    // WEB API를 테스트할 때 사용되고, 스프링MVC 테스트의 시작점, 이 클래스로 HTTP Get, post 등 api 테스트 가능
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        // MockMvc로 hello 주소에 대한 get 요청 수행
        mvc.perform(get("/hello"))
                // 200 뜨니?
                .andExpect(status().isOk())
                // hello는 뜨니?
                .andExpect(content().string(hello));
    }
}
