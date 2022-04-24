package com.javarush.task.pro.task06.task0609;

/* 
Кубический калькулятор в кубе
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long number = console.nextLong();
        System.out.println(ninthDegree(number));
    }
    public static long cube(long a) {
        return a*a*a;
    }

    public static long ninthDegree(long value) {
        return cube(cube(value));
    }
}
