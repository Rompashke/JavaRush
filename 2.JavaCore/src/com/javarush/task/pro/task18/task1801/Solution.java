package com.javarush.task.pro.task18.task1801;

import java.util.ArrayList;

/* 
Две реализации одного интерфейса
*/

public class Solution {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        list.add(runnable);
    }

    public static void runList() {
        for (Runnable element: list) {
            element.run();
        }
    }
}

/*
Требования:
1.	В публичном статическом методе void addToList(Runnable) нужно добавлять в список list элемент, полученный
в качестве входящего параметра.
2.	В публичном статическом методе void runList() нужно вызывать метод run() у каждого элемента списка list.
 */