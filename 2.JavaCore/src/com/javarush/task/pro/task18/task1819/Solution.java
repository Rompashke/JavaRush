package com.javarush.task.pro.task18.task1819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* 
Как быть, если в списке есть элемент null
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
        list.forEach(s -> System.out.println(Optional.ofNullable(s).orElse(text)));
    }
}

/*
Требования:
1.	В публичном статическом методе printList(List&lt;String&gt;) нужно вызывать метод orElse()
объекта типа Optional&lt;String&gt;
2.	Метод printList(List&lt;String&gt;) нужно реализовать согласно условию.
3.	В методе printList(List&lt;String&gt;) не нужно использовать циклы, оператор if/else и тернарный оператор.
 */
