package com.example.gccoffee.dto.response;


import com.example.gccoffee.dto.ArticleDto;

import java.io.Serializable;
import java.time.LocalDateTime;

public record ArticleResponse(
        Long id,
        String title,
        String content,
        String type,
        String status,
        LocalDateTime createdAt,
        String email,
        String nickname
) implements Serializable {

    public static ArticleResponse of(Long id, String title, String content, String type, String status, LocalDateTime createdAt, String email, String nickname) {
        return new ArticleResponse(id, title, content, type, status, createdAt, email, nickname);
    }

    public static ArticleResponse from(ArticleDto dto) {
        String nickname = dto.userAccountDto().nickname();
        if (nickname == null || nickname.isBlank()) {
            nickname = dto.userAccountDto().userId();
        }

        return new ArticleResponse(
                dto.id(),
                dto.title(),
                dto.content(),
                dto.type(),
                dto.status(),
                dto.createdAt(),
                dto.userAccountDto().email(),
                nickname
        );
    }

}
