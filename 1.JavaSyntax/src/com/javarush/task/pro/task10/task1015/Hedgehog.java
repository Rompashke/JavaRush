package com.javarush.task.pro.task10.task1015;

/* 
Ежик и яблоко
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Hedgehog hedgehog = new Hedgehog();
        hedgehog.eat(apple);
    }

    public static class Apple {
    }
}

/*
Наша задача &mdash; накормить ежика. Нужно в методе main создать один объект Apple и один объект Hedgehog, у которого вызвать метод
eat и передать нужный аргумент &mdash; яблоко.


Требования:
1.	В классе Hedgehog должен существовать вложенный класс public static class Apple.
2.	В классе Hedgehog должен существовать не статический, публичный void метод eat(Apple).
3.	В методе main должен быть создан один объект класса Apple.
4.	В методе main должен быть создан один объект класса Hedgehog.
5.	В методе main у объекта класса Hedgehog нужно вызвать метод eat и передать созданный объект класс Apple.
 */