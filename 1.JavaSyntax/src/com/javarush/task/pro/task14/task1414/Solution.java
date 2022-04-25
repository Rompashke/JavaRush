package com.javarush.task.pro.task14.task1414;

/* 
Готовим коктейли
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement el: stackTrace) {
            System.out.print(String.format(OUTPUT_FORMAT, el.getMethodName(), el.getLineNumber(), el.getClassName(),
                    el.getFileName()));
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
/*
Пример:
Метод addJuice вызван из строки 24 класса ru.rush.task.pro.task14.task1414.Solution в файле Solution.java.
 */