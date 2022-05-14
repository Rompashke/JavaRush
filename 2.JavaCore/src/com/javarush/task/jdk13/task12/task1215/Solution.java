package com.javarush.task.jdk13.task12.task1215;

/* 
Корова — тоже животное
*/

public class Solution {
    public static void main(String[] args) {

    }


    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        public String getName() {
            return "Муму";
        }
    }
}

/*
Требования:
1.	Класс Animal должен быть абстрактным.
2.	Класс Cow не должен быть абстрактным.
3.	Класс Cow должен наследоваться от класса Animal.
4.	Класс Cow должен реализовать абстрактный метод из класса Animal.
5.	Метод getName() класса Cow должен возвращать любое имя коровы.
 */
