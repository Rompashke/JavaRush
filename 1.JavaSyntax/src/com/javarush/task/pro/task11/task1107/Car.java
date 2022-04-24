package com.javarush.task.pro.task11.task1107;

/* 
Двигатель — сердце автомобиля
*/

public class Car {
    class Engine {
        private boolean isRunning;

        public void start() {
            this.isRunning = true;
        }

        public void stop() {
            this.isRunning = false;
        }

    }

    Engine engine;
}

/*
Требования:
1.	В классе Car нужно создать внутренний класс (inner class) Engine.
2.	В классе Engine должно существовать приватное поле isRunning типа boolean.
3.	В классе Engine должен существовать публичный метод void start, который устанавливает значение true полю isRunning.
4.	В классе Engine должен существовать публичный метод void stop, который устанавливает значение false полю isRunning.
5.	В классе Car должно существовать поле engine типа Engine.

 */
