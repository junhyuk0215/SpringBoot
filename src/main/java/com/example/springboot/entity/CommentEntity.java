package com.example.springboot.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "comment")
@Data
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false) // 외래 키
    private ArticleEntity article; // 게시글 객체

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // 외래 키
    private UserEntity user; // 회원 객체

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content; // 댓글 내용

    @Column(nullable = false)
    private LocalDateTime created_at = LocalDateTime.now(); // 댓글 작성일

    private Date updated_at; // 댓글 수정일


}
