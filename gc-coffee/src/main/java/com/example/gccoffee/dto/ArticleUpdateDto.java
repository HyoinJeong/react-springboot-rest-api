package com.example.gccoffee.dto;

public record ArticleUpdateDto(
        String title,
        String content,
        String type
) {
    public static ArticleUpdateDto of(String title, String content, String type) {
        return new ArticleUpdateDto(title, content, type);
    }
}
