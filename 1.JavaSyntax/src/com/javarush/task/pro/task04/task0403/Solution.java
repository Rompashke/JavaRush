package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        boolean isEnter = false;
        Scanner console = new Scanner(System.in);
        while (!isEnter) { // True
            while (console.hasNextInt()) { // проверяем является ли значение введенное с клавиатуры целочисленным?
                int number = console.nextInt(); // если да то присваиваем number значение
                sum = sum + number; // суммируем числа в sum
            }
            String line = console.nextLine(); // если значение введенное с клавиатуры строка то присваиваем его переменной line
            isEnter = line.equals("ENTER"); // если сходится, то isEnter становится true иначе остается false
            if (isEnter) { // если isEnter стало true тогда блок выполнится (выведится значение переменной sum) иначе нет.
                System.out.println(sum);
            }
        }
    }
}