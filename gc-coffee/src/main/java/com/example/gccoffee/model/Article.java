package com.example.gccoffee.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@ToString(callSuper = true)
@Table(indexes = {
        @Index(columnList = "title"),
        @Index(columnList = "type"),
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy"),
        @Index(columnList = "status")
})
@Entity
public class Article extends AuditingFields {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter @ManyToOne(optional = false) @JoinColumn(name = "userId") private UserAccount userAccount; // 유저 정보 (ID)
    @Setter @Column(nullable = false) private String title; // 제목
    @Setter @Column(nullable = false, length = 10000) private String content; // 본문

    @Setter private String type; // 문의 종류
    @Setter @Column(columnDefinition = "varchar(20) default '답변대기'") private String status; // 답변 상태

    @ToString.Exclude
    @OrderBy("createdAt DESC")
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private final Set<ArticleComment> articleComments = new LinkedHashSet<>();


    protected Article() {}

    private Article(UserAccount userAccount, String title, String content, String type) {
        this.userAccount = userAccount;
        this.title = title;
        this.content = content;
        this.type = type;
        this.status = "답변대기";
    }

    public static Article of(UserAccount userAccount, String title, String content, String type) {
        return new Article(userAccount, title, content, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article article)) return false;
        return id != null && id.equals(article.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
