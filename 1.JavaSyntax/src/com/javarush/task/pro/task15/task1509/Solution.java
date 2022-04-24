package com.javarush.task.pro.task15.task1509;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/* 
Еще раз читаем из консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
             Scanner console = new Scanner(stream)) {
            String line = console.nextLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

/*
Требования:
1.	Программа должна считать из консоли строку и вывести на экран список букв, из которых состоит введенная строка.
2.	Для чтения из консоли в программе должен быть использован Scanner вместо BufferedReader.
 */

