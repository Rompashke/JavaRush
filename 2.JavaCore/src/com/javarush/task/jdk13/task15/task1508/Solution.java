package com.javarush.task.jdk13.task15.task1508;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(1.5, "Стрижка");
        labels.put(1.7, "Стрижка2");
        labels.put(1.8, "Стрижка3");
        labels.put(1.9, "Стрижка4");
        labels.put(2.5, "Стрижка5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}

/*
Требования:
1.	В классе Solution должен быть только один метод &mdash; main().
2.	В классе Solution должно быть объявлено статическое поле labels типа Map.
3.	Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
4.	Метод main должен выводить содержимое labels на экран.
 */
