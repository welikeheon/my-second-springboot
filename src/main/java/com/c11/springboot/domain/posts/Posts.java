package com.c11.springboot.domain.posts;

import com.c11.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 어노테이션 순서: 주요 어노테이션 클래스에 가깝게 둬야 함..(롬복, JPA)
 * 롬복이 더이상 필요 없을 때 쉽게 사용할 수 있음.
 */
@Getter // 롬복의 어노테이션
@NoArgsConstructor // 롬복의 어노테이션
@Entity // JPA의 어노테이션, 테이블과 링크될 클래스임을 나타냄. CamelCase를 따름 (e.g, SalesManager --> sales_manager) 로 될 것임.
public class Posts extends BaseTimeEntity {
    @Id
    /**
     * @GeneratedValue 는 PK의 생성규칙을 나타냄.
     * 스프링부트 2.0에서는 strategy = GenerationType.IDENTITY 옵션을 추가해야 auto_increment 가 됨.
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long id;

    /**
     * @Column 은 테이블의 컬럼을 나타냄 기본값 외 추가로 선언할 필요가 있을때 사용되는 어노테이션.
     * 기본 값을 따르고 싶다면? 그냥 생략해도 됨.
     */
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
