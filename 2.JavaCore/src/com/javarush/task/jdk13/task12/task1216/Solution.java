package com.javarush.task.jdk13.task12.task1216;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        @Override
        public Pet getChild() {
            return null;
        }

        @Override
        public String getName() {
            return null;
        }
    }

    public static class Dog extends Pet {

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Pet getChild() {
            return null;
        }
    }

}

/*
Требования:
1.	Класс Pet должен быть абстрактным.
2.	Класс Dog не должен быть абстрактным.
3.	Класс Cat не должен быть абстрактным.
4.	Класс Dog должен наследоваться от класса Pet и реализовывать его абстрактные методы.
5.	Класс Cat должен наследоваться от класса Pet и реализовывать его абстрактные методы.
 */
