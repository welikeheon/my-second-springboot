package com.c11.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository<Entity Class Type, PK타입> 을 상속하면...?
 * CRUD Method 가 자동으로 생성된다...?! 뿌슝빠숑뿌슝빠숑..... ㄷㄷ
 * 단! Entity 클래스와 EntityRepository 는 함께 위치해야 하고, Entity클래스는 기본 Repository가 없으면 제대로 역할 못함.
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
