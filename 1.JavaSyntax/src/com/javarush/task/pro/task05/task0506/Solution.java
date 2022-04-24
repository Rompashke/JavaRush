package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        if (console.hasNextInt()) {
            int n = console.nextInt();
            if (n > 0) {
                array = new int[n];
                for (int i = 0; i < array.length; i++) {
                    array[i] = console.nextInt();
                }
                int min = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
                System.out.println(min);
            }
        }
    }
}
