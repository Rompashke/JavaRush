package com.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Поверхностное копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        if (Files.isDirectory(sourceDirectory) && Files.isDirectory(targetDirectory)) {
            try (DirectoryStream<Path> paths = Files.newDirectoryStream(sourceDirectory)) {
                for (Path path : paths) {
                    if (Files.isRegularFile(path)) {
                        Path resolve = targetDirectory.resolve(path.getFileName());
                        Files.copy(path, resolve);
                    }
                }
            }
        }
    }
}

/*
Требования:
1.	Программа должна считать из консоли путь к директории.
2.	В программе должны быть использованы соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().
3.	Программа должна копировать файлы из одной директории в другую согласно условию.
4.	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */

