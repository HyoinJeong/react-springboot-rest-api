package com.example.gccoffee.repository;

import com.example.gccoffee.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}