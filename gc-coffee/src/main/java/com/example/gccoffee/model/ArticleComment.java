package com.example.gccoffee.model;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article; // 게시글(ID)
    private String content; // 본문

    private LocalDateTime createdAt;
    private String createdBy; // 생성자
    private LocalDateTime updatedAt;
    private String updatedBy;
}
