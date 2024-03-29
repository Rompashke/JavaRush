package com.javarush.task.jdk13.task16.task1627;

import java.util.ArrayList;
import java.util.List;

/* 
Один для всех, все - для одного
*/

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static void ourInterruptMethod() {
        for (Thread thread : threads) {
            thread.interrupt();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //fix 2 variables - исправь 2 переменных (поправил)
            boolean isCurrentThreadInterrupted = getCurrentThread().isInterrupted();
            String threadName = getCurrentThread().getName();

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Объект " + sharedResource + ", нить " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ignore) {
            }
        }

        public static Thread getCurrentThread() {
            return Thread.currentThread();
        }
    }
}

/*
Требования:
1.	Метод ourInterruptMethod должен прервать все нити из списка threads. (выполнено)
2.	Метод run должен получать текущую нить с помощью статического метода Water.getCurrentThread(). (поправил)
3.	Метод run должен использовать метод isInterrupted текущей нити. (выполнено)
4.	Метод run должен использовать метод getName текущей нити. (выполнено)
5.	Метод main должен работать примерно 3 сек. (выполнено)
 */
