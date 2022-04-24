package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        int intRound =(int) Math.round(Double.parseDouble(string));
        System.out.println(intRound);
    }
}
/*
Требования:
1.	В методе main должен вызываться метод parseDouble класса Double.
2.	В методе main должен вызываться метод round класса Math.
3.	В консоли должно выводиться число 13.
 */