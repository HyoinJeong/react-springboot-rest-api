package com.example.gccoffee.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Index;
import javax.persistence.Table;
import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title; // 제목
    private String content; // 본문
    private String type; // 분류

    private LocalDateTime createdAt;
    private String createdBy; // 생성자
    private LocalDateTime updatedAt;
    private String updatedBy;
}
