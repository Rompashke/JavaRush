package com.javarush.task.jdk13.task28.task2814;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

/* 
Сбор статистики
*/

public class Solution {

    public static ExecutorService cachedPool = Executors.newCachedThreadPool();

    public static void main(String[] args) throws Exception {
        Callable<String> task = () -> {
            Thread.sleep(100);

            return "Done";
        };

        printStatistic();
        invokeMillionTasks(task);
        printStatistic();
        shutdown();
    }

    public static void invokeMillionTasks(Callable<String> task) throws Exception {
        // Создаем коллекцию
        List<Callable<String>> taskCollection = new ArrayList<>();
        // Добавляем в коллекцию 1000000 task
        for (int i = 0; i < 1000000; i++) {
            taskCollection.add(i, task);
        }
        // Передача коллекции в cachedPool
        cachedPool.invokeAll(taskCollection);
    }

    public static void printStatistic() {
        ThreadPoolExecutor pool = (ThreadPoolExecutor) cachedPool;

        System.out.println("-------------------------------------------");
        System.out.println("Наибольшее число нитей одновременно находящихся в пуле: "
                + pool.getLargestPoolSize());
        System.out.println("Максимально возможное количество нитей в пуле: "
                + pool.getMaximumPoolSize());
        System.out.println("Текущее количество нитей в пуле: "
                + pool.getPoolSize());
        System.out.println("Количество запланированных задач: "
                + pool.getTaskCount());
    }

    public static void shutdown() throws Exception {
        cachedPool.shutdown();
        boolean isTerminated = cachedPool.awaitTermination(100, TimeUnit.MILLISECONDS);
        if (!isTerminated) {
            cachedPool.shutdownNow();
        }
    }
}

/*
Требования:
1.	Метод invokeMillionTasks должен вызвать у ExecutorService метод invokeAll передав туда коллекцию состоящую из
миллиона объектов task.
 */
