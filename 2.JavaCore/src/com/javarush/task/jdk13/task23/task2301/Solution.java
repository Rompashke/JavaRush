package com.javarush.task.jdk13.task23.task2301;

/* 
Inner
*/



public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public static void main(String[] args) {
//        Solution.getTwoSolutions();
    }

    public static Solution[] getTwoSolutions() {
        Solution[] solutions = new Solution[2];
        for (int i = 0; i < 2; i++) {
            solutions[i] = new Solution();
            for (int j = 0; j < 2; j++) {
                solutions[i].innerClasses[j] = new InnerClass();
            }
        }
        return solutions;
    }

    public static class InnerClass {
    }
}

/*
Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.

Требования:
1.	В классе Solution должен быть реализован метод getTwoSolutions.
2.	Метод getTwoSolutions должен быть статическим.
3.	Метод getTwoSolutions должен быть публичным.
4.	Метод getTwoSolutions должен возвращать массив типа Solution заполненный согласно заданию.
 */
