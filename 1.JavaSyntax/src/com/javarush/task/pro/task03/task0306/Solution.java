package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line1 = scanner.nextInt(), line2 = scanner.nextInt(), line3 = scanner.nextInt();
        if ((line1 < line2 + line3) && (line2 < line1 + line3) && (line3 < line1 + line2)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}
