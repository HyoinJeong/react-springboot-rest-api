package com.example.gccoffee.dto;

import com.example.gccoffee.model.Article;

import java.time.LocalDateTime;

public record ArticleDto(
        Long id,
        UserAccountDto userAccountDto,
        String title,
        String content,
        String type,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
) {
    public static ArticleDto of(Long id, UserAccountDto userAccountDto, String title, String content, String type, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        return new ArticleDto(id, userAccountDto, title, content, type, createdAt, createdBy, updatedAt, updatedBy);
    }

    public static ArticleDto from(Article entity) {
        return new ArticleDto(
                entity.getId(),
                UserAccountDto.from(entity.getUserAccount()),
                entity.getTitle(),
                entity.getContent(),
                entity.getType(),
                entity.getCreatedAt(),
                entity.getCreatedBy(),
                entity.getUpdatedAt(),
                entity.getUpdatedBy()
        );
    }

    public Article toEntity() {
        return Article.of(
                userAccountDto.toEntity(),
                title,
                content,
                type
        );
    }

}
