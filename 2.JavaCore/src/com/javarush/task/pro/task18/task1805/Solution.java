package com.javarush.task.pro.task18.task1805;

import java.util.ArrayList;
import java.util.Collections;

/* 
Прощание с лямбда-выражением
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        Collections.sort(strings, new StringComparator());
    }
}

/*
Требования:
1.	В отдельном файле нужно создать публичный класс StringComparator, который реализует
интерфейс Comparator&lt;String&gt;.
2.	В классе StringComparator нужно создать публичный метод int compare(String s1, String s2).
3.	Метод compare(String s1, String s2) нужно реализовать согласно условию.
4.	В методе sortStringsByLength(ArrayList&lt;String&gt;) нужно сортировать список строк по возрастанию их длины.
5.	В методе sortStringsByLength(ArrayList&lt;String&gt;) для сортировки списка строк по возрастанию их длины
нужно использовать собственный компаратор (объект типа StringComparator).
 */
