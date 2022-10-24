package com.example.gccoffee.model.constant;

import lombok.Getter;

public enum SearchType {
    TITLE("제목"),
    CONTENT("본문"),
    ID("유저 ID"),
    NICKNAME("닉네임"),
    TYPE("문의종류");

    @Getter private final String description;

    SearchType(String description) {
        this.description = description;
    }

}
