package com.javarush.task.pro.task18.task1822;

import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

/* 
Из потока данных в список
*/

public class Solution {

    public static void main(String[] args) {
        var numbers = Stream.of(-1, 10, 43, 0, -32, -4, 22);

        getPositiveNumbers(numbers).forEach(System.out::println);
    }

    public static List<Integer> getPositiveNumbers(Stream<Integer> numbers) {
        return numbers.filter(number -> number > 0).collect(toList());
    }
}

/*
Для решения этой задачи необходимо, чтобы метод getPositiveNumbers(Stream&lt;Integer&gt;)
преобразовывал входящий поток чисел в список чисел больше нуля.
Реализуй его, используя метод collect() объекта типа Stream&lt;Integer&gt;. В качестве параметра передай
нужный коллектор
(объект типа Collector&lt;List&lt;Integer&gt;&gt;). Такой объект можно получить, вызвав статический метод
toList() класса Collectors.

 */
