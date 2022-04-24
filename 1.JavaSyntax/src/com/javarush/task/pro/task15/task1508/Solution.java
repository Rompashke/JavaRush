package com.javarush.task.pro.task15.task1508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Читаем из консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
             InputStreamReader readerLines = new InputStreamReader(stream);
             BufferedReader buffer = new BufferedReader(readerLines)) {
            String line = buffer.readLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                } else {
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
/*
Требования:
1.	Программа должна считать из консоли строку и вывести ее на экран, чередуя регистр символов.
2.	Для чтения из консоли в программе должен быть использован BufferedReader вместо Scanner.
 */

