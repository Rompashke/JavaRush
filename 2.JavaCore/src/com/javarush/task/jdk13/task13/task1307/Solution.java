package com.javarush.task.jdk13.task13.task1307;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    // кот
    class Cat implements Movable, Edible, Eat {
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }

    // пес
    class Dog implements Movable, Eat {
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    // мышь
    class Mouse implements Movable, Edible {
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }
}

/*
Требования:
1.	Класс Cat должен быть объявлен внутри класса Solution.
2.	Класс Dog должен быть объявлен внутри класса Solution.
3.	Класс Mouse должен быть объявлен внутри класса Solution.
4.	Кот (Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
5.	Мышь (Mouse) может передвигаться и может быть съедена.
6.	Собака (Dog) может передвигаться и съесть кого-то.
 */