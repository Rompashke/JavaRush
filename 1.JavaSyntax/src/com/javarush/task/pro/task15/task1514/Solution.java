package com.javarush.task.pro.task15.task1514;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);
        try {
            Path result = path1.relativize(path2);
            System.out.println(result);
        } catch (Exception ign) {

        }
    }
}
/*
Требования:
1.	Программа должна считать из консоли два пути.
2.	Программа должна выводить в консоли относительный путь между введенными путями, если он существует.
3.	Для вычисления относительного пути должен быть использован метод relativize() класса Path.
4.	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */

