package com.javarush.task.jdk13.task28.task2801;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишем свою ThreadFactory
*/

public class Solution {

    public static void main(String[] args) { // не участвует в тестирование
        class EmulatorThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulatorThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulatorThreadFactoryTask());

        thread.start();
        thread2.start();
    }

    private static void emulateThreadFactory() { // не участвует в тестирование
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }

    public static class AmigoThreadFactory implements ThreadFactory {
        // Создаем несколько полей (состояния для объекта)
        private final ThreadGroup group;
        private final String preName;
        private final AtomicInteger threadNumber = new AtomicInteger(1);
        private final static AtomicInteger POOL_NUMBER = new AtomicInteger(1);
        // инициализация переменных при помощи конструктора
        public AmigoThreadFactory() {
            this.group = Thread.currentThread().getThreadGroup();
            // вот с префиксом имени что-то совсем не понятно, вроде как мы просто храним название группы фреда и его номер
            this.preName = group.getName() + "-pool-" + POOL_NUMBER.getAndIncrement() + "-thread-";
        }

        @Override
        public Thread newThread(Runnable r) {
            // создаем фред
            Thread thread = new Thread(group, r, preName + threadNumber.getAndIncrement(), 0);
            // проверяем является ли фред даемоном, если да, то меняем на не даемона
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            // проверяем приоритет, если не нормальный, то выставляем нормальный
            if (thread.getPriority() != Thread.NORM_PRIORITY) {
                thread.setPriority(Thread.NORM_PRIORITY);
            }
            // возвращаем фред
            return thread;
        }
    }
}

