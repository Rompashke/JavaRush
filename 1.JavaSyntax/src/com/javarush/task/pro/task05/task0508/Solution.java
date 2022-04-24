package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        if (console.hasNextLine()) { // Проверка на ввод строки
            strings = new String[6];
            for (int i = 0; i < strings.length; i++) { // Заполняем массив
                strings[i] = console.nextLine();
            }
            for (int i = 0; i < strings.length; i++) { // Сравниваем каждую ячейку с каждой
                if (strings[i] == null) {
                    continue;
                }
                String duplexWord = strings[i];
                for (int j = 0; j < strings.length; j++) {
                    if (duplexWord.equals(strings[j]) && i != j) { // Сравнение содержимого ячеек
                        strings[i] = null;
                        strings[j] = null;
                    }
                }
            }
            for (int i = 0; i < strings.length; i++) { // Выводим содержимое
                System.out.print(strings[i] + ", ");
            }
        }
    }
}
