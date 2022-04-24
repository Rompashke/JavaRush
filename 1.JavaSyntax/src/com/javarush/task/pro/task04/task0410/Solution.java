package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;


/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int midNumber = Integer.MAX_VALUE;
        int i = 0;
        while (console.hasNextInt()) {
            int number = console.nextInt();
            if (number < minNumber) {
                midNumber = minNumber;
                minNumber = number;
            } else if ((number <= midNumber) && (number > minNumber)){
                midNumber = number;
            } else if ((minNumber == number) && (midNumber == number)) {
                midNumber = number;
            }
            i++;
        }
        if (i > 1) {
            System.out.println(midNumber);
        }
    }
}


