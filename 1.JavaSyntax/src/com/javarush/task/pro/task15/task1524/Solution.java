package com.javarush.task.pro.task15.task1524;

import java.io.*;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream input = new FileInputStream(scanner.nextLine());
             FileOutputStream output = new FileOutputStream(scanner.nextLine())) {
            byte[] bufferIn = input.readAllBytes();
            byte[] bufferOut = new byte[bufferIn.length];
            for (int i = 0; i < bufferOut.length; i = i + 2) {
                if (i < bufferOut.length - 1) {
                    bufferOut[i] = bufferIn[i + 1];
                    bufferOut[i + 1] = bufferIn[i];
                } else {
                    bufferOut[i] = bufferIn[i];
                }
            }
            output.write(bufferOut);
        }
        catch (IOException e) {
            System.out.println("Такого файла не существует");
        }
    }
}
/*
Требования:
1.	Программа должна считать из консоли пути к файлам.
2.	Программа должна переписывать байты из одного файла в другой согласно условию.
3.	Для чтения и записи файлов должны быть использованы FileInputStream и FileOutputStream.
4.	Потоки для чтения и записи должны быть закрыты.
 */