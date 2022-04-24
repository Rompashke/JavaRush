package com.javarush.task.pro.task07.task0706;

/* 
Странное деление
*/

public class Solution {
    public static void main(String[] args) {
        double firstNumber = 100D / 0D;
        div(firstNumber, firstNumber);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
