package com.javarush.task.jdk13.task28.task2815;

import java.util.Random;
import java.util.concurrent.*;

/* 
Пакуем лампочки
*/

public class Solution {

    private static final BlockingQueue<String> QUEUE = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        runProcess(Executors.newSingleThreadExecutor());
        runProcess(Executors.newCachedThreadPool());
        runProcess(Executors.newWorkStealingPool());

    }

    public static void runProcess(ExecutorService consumerService) {
        System.out.println("--------------------------------------");
        simulatingProducers();
        startConsumers(consumerService);
    }

    private static void simulatingProducers() {
        int maxProdBulbs = 5_000_000;
        Random rnd = new Random();
        System.out.println("Эмулируем работу производителей...");
        System.out.println("Производители произвели " + maxProdBulbs + " лампочек...");

        for (int i = 0; i < maxProdBulbs; i++) {
            QUEUE.offer("Лампочка №" + rnd.nextInt(5000));
        }

    }

    private static void startConsumers(ExecutorService consumerService) {
        System.out.println("Для упаковки используется: " + consumerService.getClass().getSimpleName());

        int queueSize = QUEUE.size();
        Consumer consumer = new Consumer();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < queueSize; i++) {
            consumerService.execute(consumer);
        }

        consumerService.shutdown();
        try {
            consumerService.awaitTermination(Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            System.out.println("Упаковщики упаковали все лампочки за " + (System.currentTimeMillis() - startTime) + " мс");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private static class Consumer implements Runnable {

        @Override
        public void run() {
            String bulb = QUEUE.poll();
//            if (bulb != null) {
//                System.out.println("Упакована: " + bulb + " упаковщиком: " + Thread.currentThread().getName());
//            }
        }
    }
}

/*
Разберись, что делает программа.
1. Допиши метод simulatingProducers. Он должен добавлять в очередь QUEUE 5 миллионов лампочек.
Для нумерации лампочек можешь воспользоваться генератором случайных чисел.
2. В методе main три раза вызови метод runProcess передавая в него разные ExecutorService.
Для создания ExecutorService воспользуйся методами newSingleThreadExecutor, newCachedThreadPool и newWorkStealingPool.


Требования:
1.	Метод simulatingProducers должен добавлять в QUEUE 5 миллионов лампочек.
2.	Метод main должен трижды вызвать метод runProcess передавая в него три разных ExecutorService.
 */
