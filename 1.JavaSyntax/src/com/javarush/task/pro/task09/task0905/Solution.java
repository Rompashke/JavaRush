package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;
import java.lang.Math;

/* 
Восьмеричный конвертер
*/

public class Solution {
    /*
    Метод main() не принимает участие в тестировании.
     */
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    /*
    Публичный статический метод toOctal(int) должен переводить целое число, полученное в качестве входящего параметра, из
    десятичной системы счисления в восьмеричную.

    Один из алгоритмов перевода десятичного числа в восьмеричное следующий:
    i равно 0
    while(десятичное число не равно 0) {
    восьмеричное число = восьмеричное число + (остаток от деления десятичного числа на 8) * на 10 в степени i
    десятичное число = десятичное число / 8
    i увеличиваем на 1
    }

    Подсказка: чтобы возвести число в степень, можно использовать метод Math.pow(число, степень).
     */
    public static int toOctal(int decimalNumber) {
        if (decimalNumber > 0) {
            int i = 0;
            int octalNumber = 0;
            while (decimalNumber != 0) {
                double degreeNumber = Math.pow(10, i);
                octalNumber = (int) (octalNumber + (decimalNumber % 8) * degreeNumber);
                decimalNumber = decimalNumber / 8;
                i++;
            }
            return octalNumber;
        } else {
            return 0;
        }
    }

    /*
    Публичный статический метод toDecimal(int) из восьмеричной в
десятичную.

Один из алгоритмов перевода восьмеричного числа в десятичное следующий:
i равно 0
while(восьмеричное число не равно 0) {
десятичное число = десятичное число + (остаток от деления восьмеричного числа на 10) * на 8 в степени i
восьмеричное число = восьмеричное число / 10
i увеличиваем на 1
}

Подсказка: чтобы возвести число в степень, можно использовать метод Math.pow(число, степень).
     */
    public static int toDecimal(int octalNumber) {
        if (octalNumber > 0) {
            int i = 0;
            int decimalNumber = 0;
            while (octalNumber != 0) {
                double degreeNumber = Math.pow(8, i);
                decimalNumber = (int) (decimalNumber + (octalNumber % 10) * degreeNumber);
                octalNumber = octalNumber / 10;
                i++;
            }
            return decimalNumber;
        } else {
            return 0;
        }
    }
}

/*
Методы работают только с положительными числами. Если входящий параметр меньше или равен 0, методы возвращают 0.
 */
