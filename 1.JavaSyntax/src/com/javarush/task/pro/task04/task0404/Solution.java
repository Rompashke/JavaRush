package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int n = 0;
            while (n < 10) {
                System.out.print("Q");
                n++;
            }
            System.out.println();
            i++;
        }
    }
}