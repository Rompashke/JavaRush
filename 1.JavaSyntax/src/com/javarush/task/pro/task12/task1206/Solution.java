package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
//        char[] strToChar = new char[string.length()];
//        string.getChars(0, string.length(), strToChar, 0);
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
//        char[] strToChar = new char[string.length()];
//        string.getChars(0, string.length(), strToChar, 0);
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
//        char[] strToChar = new char[string.length()];
//        string.getChars(0, string.length(), strToChar, 0);
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
/*
Требования:
1.	Метод countDigits(String) должен возвращать количество цифр в переданной строке.
2.	Метод countLetters(String) должен возвращать количество букв в переданной строке.
3.	Метод countSpaces(String) должен возвращать количество пробелов в переданной строке.
 */
