package com.javarush.task.jdk13.task28.task2816;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* 
Рекурсивный алфавит
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"; //переменная с алфавитом строкой
        ExecutorService stealingPool = Executors.newWorkStealingPool(); // создаем пул потоков по количеству ядер в jdk
        // переменная фъюче содержит результат метода ниже
        Future<String> future = stealingPool.submit(() -> {
            System.out.println("старт");
            Thread.sleep(100);
            return "";
        });
        // разбиваем строку алфавит на символы
        for (char c : alphabet.toCharArray()) {
            future = stealingPool.submit(new Task(c, future));
        }

        stealingPool.awaitTermination(1, TimeUnit.SECONDS);
    }
}


