package com.javarush.task.jdk13.task28.task2811;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* 
Знакомство с Executors
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i < 21; i++) {
            int localID = i;
            executorService.submit(() -> doExpensiveOperation(localID));
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);


    }

    private static void doExpensiveOperation(int localID) {
        System.out.println(Thread.currentThread().getName() + ", localID=" + localID);
    }
}

/*
Требования:
1.	Используя класс Executors, создай в методе main фиксированный пул из 5 трэдов.
2.	Пул должен принимать на исполнение 20 задач Runnable.
3.	Каждая задача должна вызывать метод doExpensiveOperation с порядковым номером задачи, начиная с 1.
4.	Запрети добавление новых задач на исполнение в пул.
5.	На завершение всех задач в пуле нужно установить 5 секунд.
 */
