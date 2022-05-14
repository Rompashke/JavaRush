package com.javarush.task.jdk13.task15.task1504;

/* 
Все лишнее - прочь!
*/

public class Solution {
    public static void main(String[] args) {
        add((short) 1, 2f); // short float
        add(1, 2); // int int
        add(2d, 2); // double int
//        add("1", 2d); // String double
        add((byte) 1, 2d); // byte double
    }

    public static void add(int i, int j) {
        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {
        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {
        System.out.println("Double addition");
    }
}
