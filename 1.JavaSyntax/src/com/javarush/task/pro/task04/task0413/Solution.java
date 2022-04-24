package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--) {
            int numberEight = 10 - i;
            for (int j = 0; j < numberEight; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}