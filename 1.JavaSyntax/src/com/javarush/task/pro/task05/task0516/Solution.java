package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        if (array.length % 2 == 0) {
            int firstHalfArrayLength = array.length / 2;
            Arrays.fill(array, 0, firstHalfArrayLength,valueStart);
            Arrays.fill(array, firstHalfArrayLength, array.length,valueEnd);
        } else {
            int firstHalfArrayLength = array.length / 2 + 1;
            Arrays.fill(array, 0, firstHalfArrayLength, valueStart);
            Arrays.fill(array, firstHalfArrayLength, array.length, valueEnd);
        }
        System.out.println(Arrays.toString(array));
    }
}
