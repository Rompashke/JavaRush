package com.javarush.task.pro.task13.task1303;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Выводим в консоли элементы множества
*/

public class Solution {

    public static void print(HashSet<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}
/*

Требования:
1.	В классе Solution должен быть публичный статический метод print(HashSet&lt;String&gt;) с типом возвращаемого значения void.
2.	Метод print(HashSet&lt;String&gt;) должен работать согласно условию.
 */
