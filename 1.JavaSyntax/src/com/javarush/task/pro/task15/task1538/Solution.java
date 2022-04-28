package com.javarush.task.pro.task15.task1538;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Использование Paths
*/

public class Solution {

    public static Path rpmLogPath;

    public static void main(String[] args) {
        try {
            try {
                rpmLogPath = Paths.get(new URI("file:/usr/lib/rpm/rpm.log"));
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        } finally {
            System.out.println("Inside bloсk finally");
        }
    }
}

/*
Требования:
1.	Метод main должен инициализировать поле rpmLogPath абсолютным путем к файлу rpm.log в папке /usr/lib/rpm.
2.	Метод main должен использовать метод Paths.get() с одним параметром типа URI для создания объекта Path.
 */
