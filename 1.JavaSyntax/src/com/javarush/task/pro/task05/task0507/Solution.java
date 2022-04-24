package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
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
                int max = array[0];
                for (int j = 0; j < array.length; j++) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                }
                System.out.println(max);
            }
        }

    }
}
