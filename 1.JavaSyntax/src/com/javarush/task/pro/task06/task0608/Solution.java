package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long number = console.nextLong();
        System.out.println(cube(number));

    }
    public static long cube(long number){
        number = number * number * number;
        return number;
    }
}
