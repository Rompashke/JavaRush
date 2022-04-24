package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10]; // создаем двумерный массив
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) { // задаем значения массиву и тут же выводим его
            int row = i + 1;
            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
                int column = j + 1;
                MULTIPLICATION_TABLE[i][j] = row * column;
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
