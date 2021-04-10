package com.c11.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // JPA 엔티티 클래스들이 BaseTimeEntity 를 상속할 경우 필드들(cratedDate, modifiedDate)도 컬럼으로 인식하게..
@EntityListeners(AuditingEntityListener.class) // BaseTimeEntity 에 Auditing 기능을 포함시킴
public class BaseTimeEntity {
    @CreatedDate // 엔티티 생성 시 시간 자동 저장됨..
    private LocalDateTime createdDate;

    @LastModifiedDate // 이렇게 하면 수정 시 시간 자동 저장 됨..
    private LocalDateTime modifiedDate;
}
