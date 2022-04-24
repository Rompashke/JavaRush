package com.javarush.task.pro.task15.task1501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Сокращаем try
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
/*
Требования:
1.	Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре.
2.	В программе должен использоваться оператор try-with-resources согласно условию.
3.	У объектов с внешними ресурсами не должен быть явно вызван метод close().
 */
