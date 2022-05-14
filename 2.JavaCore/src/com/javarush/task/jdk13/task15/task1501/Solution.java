package com.javarush.task.jdk13.task15.task1501;

/* 
Что-то лишнее
*/

public class Solution {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Integer i) {
        System.out.println("Это Integer");
    }

    public static void print(Object i) {
        System.out.println("Это Object");
    }

    public static void print(double i) {
        System.out.println("Это double");
    }


}

/*
Удали реализации всех лишних методов, чтобы вывод программы выглядел так:
Это double
Это Object
Это double
Это Integer
Это double



Требования:
1.	В классе Solution должен остаться метод print() с одним параметром типа Integer.
2.	В классе Solution должен остаться метод print() с одним параметром типа Object.
3.	В классе Solution должен остаться метод print() с одним параметром типа double.
4.	Вывод на экран должен соответствовать условию.
 */
