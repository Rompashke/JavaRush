package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) { // цикл отвечающий за создание 10 строк
            int m = 0;
            while (m < 20) { // цикл создающий сто заполнение этих 10 строк
                if (i < 1 || i > 8) { // условие которое отвечает за заполнение 1 и 10ой строки
                    System.out.print("Б");
                } else {
                    if (m < 1 || m > 18) { // условие отвечающее за первый и последний символ в строках с 2 по 8 включительно
                        System.out.print("Б");
                    } else { // условие при котором заполняется полая часть прямоугольника
                        System.out.print(" ");
                    }
                }
                m++;
            }
            System.out.println();
            i++;
        }
    }
}