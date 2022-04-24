package com.javarush.task.pro.task09.task0906;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.lang.Math;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }
    // Метод для перевода из десятичной системы счисления в двоичную
    public static String toBinary(int decimalNumber) {
        if (decimalNumber > 0) {
            //Сначало мы определяем длину массива, который нам понадобится для записи значения в двоичном код
            int countNumber = decimalNumber;
            int count = 0;
            while (countNumber > 0) {
            countNumber = countNumber / 2;
            count++;
            }
            // После окончания цикла i будет у нас обозначать длину массива в который мы будем помещать числа
            // двоичного значения
            // Создаем массив со значениями двоичного кода
            int[] temp = new int[count];
            for (int i = 0; i < count; i++) {
                temp[count - 1 - i ] = decimalNumber % 2;
                decimalNumber = decimalNumber / 2;
            }
            // Переводим массив в строку для вывода метода
            StringBuilder binaryNumber = new StringBuilder();
            for (int i = 0; i < count; i++) {
                binaryNumber.append(temp[i]);
            }
            return binaryNumber.toString();
        } else {
            return "";
        }
    }
    // Метод для перевода из двоичной системы счисления в десятичную
    public static int toDecimal(String binaryNumber) {
        if (binaryNumber != null) {
            // Сначало создаем массив и помещаем в него каждый символ строки
            String[] line = new String[binaryNumber.length()];
            for (int i = 0; i < binaryNumber.length(); i++) {
                line[i] = binaryNumber.substring(i, i+1);
            }
            // Затем создаем переменную, где будем хранить значение десятичной системы счисления
            int decimalNumber = 0;
            for (int i = 0; i < binaryNumber.length(); i++) {
                double degreeNumber = Math.pow(2, i);
                int number = Integer.parseInt(line[binaryNumber.length() - 1 - i]);
                decimalNumber = (int)(decimalNumber + (number * degreeNumber ));
            }
            return decimalNumber;
        } else {
            return 0;
        }
    }
}
