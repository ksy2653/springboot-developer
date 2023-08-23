package me.kimseokyoung.springbootdeveloper.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.kimseokyoung.springbootdeveloper.domain.Article;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleViewResponse {
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdAt;

    public ArticleViewResponse(Article article){
        this.id=article.getId();
        this.title=article.getTitle();
        this.content=article.getContent();
        this.createdAt=article.getCreatedAt();
        this.author = article.getAuthor();
    }
}
