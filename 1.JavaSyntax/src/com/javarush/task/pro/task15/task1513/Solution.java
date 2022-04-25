package com.javarush.task.pro.task15.task1513;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Зри в корень
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path rootPath = Path.of(str).getRoot();
        System.out.println(rootPath);
    }
}
/*
Требования:
1.	Программа должна считать из консоли путь к файлу/папке.
2.	Программа должна выводить в консоли диск, на котором находится этот файл (или папка).
3.	Для получения диска из пути нужно использовать метод getRoot() класса Path.
4.	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.

 */

