package com.example.gccoffee.repository.querydsl;

import com.example.gccoffee.model.Article;
import com.example.gccoffee.model.QArticle;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class ArticleRepositoryCustomImpl extends QuerydslRepositorySupport implements ArticleRepositoryCustom {

    public ArticleRepositoryCustomImpl() {
        super(Article.class);
    }

    @Override
    public List<String> findAllDistincttypes() {
        QArticle article = QArticle.article;

        return from(article)
                .distinct()
                .select(article.type)
                .where(article.type.isNotNull())
                .fetch();
    }

}