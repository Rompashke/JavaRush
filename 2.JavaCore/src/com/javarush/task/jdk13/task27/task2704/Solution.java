package com.javarush.task.jdk13.task27.task2704;

/* 
Убираем deadlock
*/

public class Solution {
    public void safeMethod(Object obj1, Object obj2) {

        Object firstObject = obj1.hashCode() > obj2.hashCode() ? obj1 : obj2;
        Object secondObject = obj2.hashCode() > obj1.hashCode() ? obj2 : obj1;

        synchronized (firstObject) {
            longTimeMethod();
            synchronized (secondObject) {
                unsafeMethod(obj1, obj2);
            }
        }
    }

    public void longTimeMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }

    protected void unsafeMethod(Object obj1, Object obj2) {
        System.out.println(obj1 + " " + obj2);
    }

    public static void main(String[] args) {
        final Object o1 = new Object();
        final Object o2 = new Object();
        final Solution solution = new Solution();

        new Thread() {
            @Override
            public void run() {
                solution.safeMethod(o1, o2);
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                solution.safeMethod(o2, o1);
            }
        }.start();
    }
}

/*
Требования:
1.	Метод safeMethod не должен вызывать deadlock при использовании из разных потоков.
2.	В методе safeMethod должен содержаться вызов метода unsafeMethod, с теми же аргументами.
3.	В методе safeMethod должен содержаться вызов метода longTimeMethod.
4.	В методе safeMethod должно содержаться два блока synchronized.
 */
