package com.javarush.task.pro.task13.task1330;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Экземпляр синглтона: " + MySingleton.INSTANCE);
    }
}
/*
MySingleton это пример реализации паттерна синглтон с помощью перечисления.
Сделай так, чтобы при вызове метода main, перед строкой &quot;Экземпляр синглтона: INSTANCE&quot;
на экран вывелась строка &quot;создание экземпляра...&quot;.
Сделать это нужно, не внося изменений в класс Solution.


Требования:
1.	Нельзя изменять класс Solution.
2.	При запуске метода main на экран должны быть выведены две строки согласно условию.
 */
