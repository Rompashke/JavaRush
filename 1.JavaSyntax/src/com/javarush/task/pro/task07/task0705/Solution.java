package com.javarush.task.pro.task07.task0705;

/* 
Бесконечность не предел
*/

public class Solution {
    public static void main(String[] args) {
        double firstNumber = 5;
        double secondNumber = 100D / 0D;
        double thirdNumber = -100D / 0D;
        div(firstNumber, secondNumber);
        div(firstNumber, thirdNumber);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
