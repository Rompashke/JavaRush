package com.javarush.task.pro.task18.task1812;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/* 
Рейтинг языков программирования
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<Language> languages = new ArrayList<>();
        Collections.addAll(languages,
                new Language("С#", 4.58),
                new Language("JavaScript", 2.54),
                new Language("Python", 10.47),
                new Language("C++", 7.11),
                new Language("Go", 1.46),
                new Language("R", 2.37),
                new Language("Java", 13.48),
                new Language("C", 15.95),
                new Language("Swift", 1.38),
                new Language("PHP", 2.49));

        Stream<Language> languageStream = sortByRanking(languages);
        languageStream.forEach(System.out::println);
    }

    public static Stream<Language> sortByRanking(ArrayList<Language> languages) {
        Stream<Language> languageStream = languages.stream();
        Stream<Language> sortLanguages = languageStream.sorted(new Comparator<Language>() {
            @Override
            public int compare(Language o1, Language o2) {
                return Double.compare(o2.getRanking(), o1.getRanking());
            }
        });
        return sortLanguages;
    }
}

/*
Класс Language представляет собой модель языка программирования.
В этом классе есть два поля: name - название языка программирования,
ranking - рейтинг использования языка программирования по состоянию на сентябрь 2020 года, согласно TIOBE.
Нужно, чтобы публичный статический метод sortByRanking(ArrayList&lt;Language&gt;) сортировал полученный
список языков программирования по убыванию рейтинга,
и возвращал отсортированный поток данных (Stream&lt;Language&gt;).

Подсказка:
Поскольку поле рейтинг имеет тип Double, для сортировки нужно использовать
статический метод compare(Double, Double) класса Double или метод
compareTo(Double) объекта типа Double.
Метод main() не принимает участие в тестировании.
 */
