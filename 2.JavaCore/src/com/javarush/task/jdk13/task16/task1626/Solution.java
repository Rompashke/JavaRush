package com.javarush.task.jdk13.task16.task1626;

/* 
А без interrupt слабо?
*/

public class Solution {

    public static boolean withOutInterupt;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        withOutInterupt = true;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!withOutInterupt) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException ignore) {
                }
            }
        }
    }
}

