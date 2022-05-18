package com.javarush.task.jdk13.task11.task1114;

public class Author {
    private final String name;
    private Article article;

    public Author(String name) {
        this.name = name;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public Article getArticle() {
        return article;
    }
}

/*
Требования:
1.	В классе Author должно быть поле private final String name.
2.	В классе Author должно быть поле private Article article.
3.	В классе Author должен быть конструктор с одним параметром типа String, который инициализирует поле name.
4.	В классе Author должен быть сеттер поля article.
5.	Класс Article не изменяй.
 */
