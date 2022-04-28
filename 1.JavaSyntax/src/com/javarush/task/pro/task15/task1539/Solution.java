package com.javarush.task.pro.task15.task1539;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/* 
Использование Paths 2
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(joinToPath(Arrays.asList("d:/", "study/", "javarush/", "полезные куски кода.txt")));
    }

    public static Path joinToPath(List<String> partsList) {
        String[] pathsArray = new String[partsList.size() - 1];
        System.arraycopy(partsList.toArray(), 1, pathsArray, 0, pathsArray.length);
        return Paths.get(partsList.get(0), pathsArray);
        }
    }
/*
Требования:
1.	Метод joinToPath должен вернуть путь состоящий из частей из списка partsList.
2.	Метод joinToPath должен использовать метод Paths.get(String first, String... more) передав
в него все элементы списка.
 */
