package com.javarush.task.jdk13.task11.task1112;

public class Car {

    private final Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void start() {
        engine.start();
    }

    public void turnOff() {
        engine.turnOff();
    }

    private static class Engine {

        private boolean running;

        private void start() {
            running = true;
            System.out.println("дыр-дыр-дыр-ДЫР-ДЫР-ДР-ДРРРРРРРРРР");
        }

        private void turnOff() {
            running = false;
            System.out.println("пффффффф");
        }
    }
}

/*
Требования:
1.	Нельзя изменять класс Engine.
2.	В классе Car должно быть поле engine.
3.	Поле engine должно инициализироваться при создании объекта Car.
4.	Методы класса Car (start и turnOff) должны вызывать соответствующие методы класса Engine.
 */
