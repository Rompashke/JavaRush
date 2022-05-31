package com.javarush.task.pro.task18.task1806;

import java.util.ArrayList;
import java.util.Collections;

/* 
Знакомство с foreach
*/

public class Solution {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }
        numbers.forEach(number -> System.out.println(number));
    }
}

/*
Требования:
1.	В методе print(ArrayList&lt;Integer&gt;) нужно использовать метод списка forEach(), принимающий лямбда-выражение.
2.	В методе print(ArrayList&lt;Integer&gt;) не нужно использовать оператор for.
3.	В методе print(ArrayList&lt;Integer&gt;) нужно выводить в консоли все элементы полученного списка по порядку.
 */
