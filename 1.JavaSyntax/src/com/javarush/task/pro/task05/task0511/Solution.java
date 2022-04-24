package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        if (console.hasNextInt()) {
            int n = console.nextInt();
            if (n > 0) {
                int y;
                multiArray = new int[n][];
                for (int i = 0; i < n; i++) {
                    y = console.nextInt();
                    multiArray[i] = new int[y];
                }
//                for (int i = 0; i < multiArray.length; i++) {
//                    for (int j = 0; j < multiArray[i].length; j++) {
//                        System.out.print(multiArray[i][j] + " ");
//                    }
//                    System.out.println();
//                }
            }
        }
    }
}
