package com.javarush.task.jdk13.task27.task2703;

/* 
Второй вариант deadlock
*/

public class Solution {
    private final Object lock = new Object();

    public synchronized void firstMethod() {
        synchronized (lock) {
            doSomething();
        }
    }

    public void secondMethod() {
        synchronized (lock) {
            synchronized (this) {
                doSomething();
            }
        }
    }

    private void doSomething() {
    }

    public static void main(String[] args) {

    }
}

/*
В методе secondMethod расставь synchronized блоки так,
чтобы при использовании класса Solution нитями образовывался deadlock.


Требования:
1.	В методе secondMethod должен присутствовать синхронизированный блок по объекту lock.
2.	В методе secondMethod должен присутствовать вложенный синхронизированный блок по объекту this.
3.	Поле lock должно быть приватным.
4.	Метод secondMethod не должен быть объявлен с модификатором synchronized.
 */
