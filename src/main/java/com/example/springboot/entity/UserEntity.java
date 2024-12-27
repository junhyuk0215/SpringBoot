package com.example.springboot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true) // 중복 방지
    private String username; // 닉네임

    @Column(nullable = false)
    private String password; // 비밀번호

    @Column(nullable = false, unique = true) // 중복 방지
    private String email; // 이메일
}
