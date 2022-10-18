package com.javarush.task.jdk13.task28.task2816;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class Task implements Callable<String> {

    private final char letter;
    private final Future<String> future;

    public Task(char letter, Future<String> future) {
        this.letter = letter;
        this.future = future;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(new Random().nextInt(20));
        System.out.println(future.get() + letter);
        return future.get() + letter;
    }
}
/*
В методе call класса Task внеси изменения в строку вывода на экран, чтобы он вывел часть алфавита от начала
алфавита и до letter.
В методе call класса Task внеси изменения в строку с return, чтобы он вернул часть алфавита от начала
алфавита и до letter.

Например: если у Task поле letter равняется &#39;к&#39;, то его метод call должен вывести в консоль и вернуть
строку &quot;абвгдеёжзийк&quot;.


Требования:
1.	Нельзя изменять класс Solution.
2.	Нельзя изменять конструктор класса Task.
3.	Метод call должен содержать ровно три команды (вызов методов sleep, println, и команда return).
4.	Метод call должен выводить на экран и возвращать часть алфавита от &#39;а&#39; до letter.
 */
