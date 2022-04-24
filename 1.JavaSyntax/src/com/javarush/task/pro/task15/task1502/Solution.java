package com.javarush.task.pro.task15.task1502;

import java.util.Scanner;

/* 
Возврат к истокам
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
/*
Требования:
1.	Программа должна считать с консоли строку и вывести ее на экран в верхнем регистре.
2.	В программе должен использоваться блок try-catch без ресурсов.
3.	У объектов с внешними ресурсами должен быть вызван метод close() в блоке finally.
 */
