package com.javarush.task.jdk13.task28.task2813;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 
Кеширование нитей
*/

public class Solution {

    public static BlockingQueue<String> queue = new ArrayBlockingQueue<>(32);
    public static ExecutorService executorService;

    public static void main(String[] args) throws Exception {
        executorService = Executors.newCachedThreadPool(); // инициализация executeService newCacheThreadPool

        submitProducers();
        submitConsumers();

        executorService.shutdownNow();
    }

    public static void submitProducers() {
        // добавление в метод submitProducers() новых задач Producers с разными аргументами
        for (int i = 0; i < 100; i++) {
            executorService.submit(new Producer("Строка № " + i));
        }

    }

    public static void submitConsumers() {
        // Добавление ста задач в Consumers одного объекта Consumer
        Consumer consumer = new Consumer();
        for (int i = 0; i < 100; i++) {
            executorService.submit(consumer);
        }

    }
}

/*
В методе main инициализируй поле executorService с помощью метода newCachedThreadPool. (Выполнено)
Реализуй методы submitProducers и submitConsumers. (Выполнено)
В методе submitProducers добавь в сервис executorService сто заданий Producer. (Выполнено)
Во все конструкторы Producer передай разные строки. (Выполнено)
В методе submitConsumers добавь в сервис executorService сто заданий Consumer. (Выполнено)
Так как у Consumer нет состояния (нет полей), используй один объект Consumer 100 раз. (Выполнено)
 */
