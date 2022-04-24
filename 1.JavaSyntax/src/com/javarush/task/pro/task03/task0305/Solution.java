package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt(), secondNumber = scanner.nextInt(), thirdNumber = scanner.nextInt();
        if (firstNumber == secondNumber & secondNumber == thirdNumber) { //условие выведения трех одинаковых значений
            System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        } else { //в елс будем вписывать совпадения по двум числам т.к по трем уже проверили
            if (firstNumber == secondNumber) { // условие выведения первого и второго чисел если равны
                System.out.println(firstNumber + " " + secondNumber);
            }
            if (secondNumber == thirdNumber) { // условие выведения второго и третьего чисел если равны
                System.out.println(secondNumber + " " + thirdNumber);
            }
            if (firstNumber == thirdNumber) { // условие выведения первого и третьего значений если равны
                System.out.println(firstNumber + " " + thirdNumber);
            }
        }
    }
}

