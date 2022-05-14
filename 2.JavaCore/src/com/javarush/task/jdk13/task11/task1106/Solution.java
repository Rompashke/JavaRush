package com.javarush.task.jdk13.task11.task1106;

/* 
Как кошка с собакой
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {
    private String name;
    private int speed;

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}

/*
Требования:
1.	Переменные класса Cat должны быть скрыты.
2.	Переменные класса Dog должны быть скрыты.
3.	Методы класса Cat должны быть скрыты.
4.	Методы класса Dog должны быть скрыты.
5.	Методы, с помощью которых классы Cat и Dog взаимодействуют друг с другом, должны быть публичными.
 */



