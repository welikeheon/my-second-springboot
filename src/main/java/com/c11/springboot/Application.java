package com.c11.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication 어노테이션으로 인해 스프링부트의 자동설정, 스프링 Bean 읽기, 생성 등 모두 자동으로 설정됨.
 * 여기 위치부터 설정을 읽어나가기 시작하기 때문에 항상 프로젝트의 최상단에 위치해야 함.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        /**
         * 내장 WAS를 실행하게 됨.
         * 이렇게 하게 되면 항상 톰캣이 앞단에 없어도 되고, 그냥 스프링부트로 만들어진 JAR 파일 실행하면 됨.
         * 스프링부트에서는 이런 방식을 권장하는데 언제나 같은 환경에서 스프링부트를 배포할 수 있어서라고....
         */

        SpringApplication.run(Application.class, args);
    }
}
