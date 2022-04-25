package com.javarush.task.pro.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path absPath = Path.of(str);
        if (absPath.isAbsolute()) {
            System.out.println(absPath);
        } else {
            Path resultPath = absPath.toAbsolutePath();
            System.out.println(resultPath);
        }
    }
}
/*
Требования:
1.	Программа должна считать из консоли путь к файлу/папке.
2.	Программа должна выводить в консоли этот путь, при необходимости преобразовывая в абсолютный.
3.	Для проверки и преобразования в абсолютный должны быть использованы методы isAbsolute() и toAbsolutePath() класса Path.
4.	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */

