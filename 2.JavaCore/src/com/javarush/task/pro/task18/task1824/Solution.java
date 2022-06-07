package com.javarush.task.pro.task18.task1824;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/* 
Из потока данных — в map
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        return stringStream.collect(Collectors.toMap(value -> value, key -> key.length()));
    }
}

/*
Необходимо, чтобы метод getMap(Stream&lt;String&gt;) преобразовывал входящий поток строк в карту (map), ключом
которой является сама строка, а значением &mdash; её длинна.
Реализуй его, используя метод collect() объекта типа Stream&lt;String&gt;. В качестве параметра передай нужный
коллектор
(объект типа Collector&lt;Map&lt;String, Integer&gt;&gt;). Такой объект можно получить, вызвав статический метод
toMap() класса Collectors.
 */
