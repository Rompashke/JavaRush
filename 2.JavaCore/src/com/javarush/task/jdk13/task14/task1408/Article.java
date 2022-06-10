package com.javarush.task.jdk13.task14.task1408;

import java.util.ArrayList;
import java.util.List;

public class Article {

    private final String name;
    private final List<LikeStatus> likes;

    public Article(String name) {
        this.name = name;
        this.likes = LikeStatus.generateMassActivity();
    }

    public String getName() {
        return name;
    }

    public int getLikesCount() {
        return likes.stream().mapToInt(Article::getOriginalLikeValue).sum();


    }

    private static int getOriginalLikeValue(LikeStatus likeStatus) {
        return switch (likeStatus) {
            case LIKE, FOLLOW, FAVORITE, HELPFUL, ARTICLE -> 1;
            case HOT, SOLUTION, OSCAR -> 2;
            case DISLIKE, SPAM, OFFTOPIC, DUPLICATE, WRONG -> -1;
            case AWFUL -> -2;
            default -> 0;
        };
/*
        switch (likeStatus) {
            case LIKE:
            case FOLLOW:
            case FAVORITE:
            case HELPFUL:
            case ARTICLE:
                return 1;
            case HOT:
            case SOLUTION:
            case OSCAR:
                return 2;
            case DISLIKE:
            case SPAM:
            case OFFTOPIC:
            case DUPLICATE:
            case WRONG:
                return -1;
            case AWFUL:
                return -2;
            default:
                return 0;
        }
 */
    }
}

/*
Твоя задача:
1. В методе getOriginalLikeValue заменить switch statement на switch expression, оставив прежнюю логику.
2. Реализовать метод getLikesCount, который должен вернуть общее число лайков данной статьи. К примеру,
если у статьи имеются такие лайки: HOT, HOT, AWFUL
то общее число лайков будет 2 + 2 - 2 = 4.
 */
