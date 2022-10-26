package com.example.gccoffee.model.constant;

import lombok.Getter;

public enum SearchType {
    TITLE("제목"),
    CONTENT("본문"),
    ID("유저 ID"),
    NICKNAME("작성자"),
    TYPE("문의종류"),
    STATUS("답변상태");

    @Getter private final String description;

    SearchType(String description) {
        this.description = description;
    }

}
