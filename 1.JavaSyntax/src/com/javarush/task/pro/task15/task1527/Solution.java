package com.javarush.task.pro.task15.task1527;

import java.io.*;
import java.util.Scanner;

/* 
 Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
                FileReader file = new FileReader(scanner.nextLine());
                BufferedReader buffer = new BufferedReader(file)) {
            int counter = 0;
            while (buffer.ready()) {
                String line = buffer.readLine();
                if (counter % 2 == 0) {
                    System.out.println(line);
                }
                counter++;
            }
        } catch (IOException e) {
            System.out.println("Неправильно указан адрес или такого файла не существует");
        }
    }
}
/*
Требования:
1.	Программа должна считать из консоли путь к файлу.
2.	Программа должна вывести в консоли содержимое файла согласно условию.
3.	Для чтения строк из файла должен быть использован BufferedReader.
4.	Поток чтения BufferedReader должен быть закрыт.
 */