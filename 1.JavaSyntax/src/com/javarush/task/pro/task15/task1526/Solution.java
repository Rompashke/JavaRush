package com.javarush.task.pro.task15.task1526;

import java.io.*;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
        FileReader readFile = new FileReader(scanner.nextLine())) {
            while (readFile.ready()) {
               char charSymbol = (char) readFile.read();
               if (charSymbol == '.' || charSymbol == ',' || charSymbol == ' ') {
                   continue;
               }
                System.out.print(charSymbol);
            }

        }
        catch (IOException e) {
            System.out.println("Неправильно указан адрес или такого файла не существует");
        }
    }
}
/*
Требования:
1.	Программа должна считать из консоли путь к файлу.
2.	Программа должна вывести в консоли содержимое файла согласно условию.
3.	Для чтения символов из файла должен быть использован FileReader.
4.	Поток чтения FileReader должен быть закрыт.
 */