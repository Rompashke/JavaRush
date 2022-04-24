package com.javarush.task.pro.task09.task0909;

/* 
Экранирование символов
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"\nIt's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"");
    }
}
/*
*1. Нужно, чтобы программа выводила текст.
*        2. Нужно, чтобы было выведено две строки.
*        3. Текст первой строки должен быть: It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
*        4. Текст второй строки должен быть: It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"
*/