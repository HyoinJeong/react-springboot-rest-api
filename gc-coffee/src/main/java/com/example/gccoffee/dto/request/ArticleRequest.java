package com.example.gccoffee.dto.request;

import com.example.gccoffee.dto.ArticleDto;
import com.example.gccoffee.dto.UserAccountDto;

public record ArticleRequest(
        String title,
        String content,
        String type
) {

    public static ArticleRequest of(String title, String content, String type) {
        return new ArticleRequest(title, content, type);
    }

    public ArticleDto toDto(UserAccountDto userAccountDto) {
        return ArticleDto.of(
                userAccountDto,
                title,
                content,
                type
        );
    }

}
