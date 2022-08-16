package com.javarush.task.jdk13.task27.task2706;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public synchronized int get() {
        while (!isValuePresent) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        isValuePresent = false;
        System.out.println("Got: " + value);
        this.notify();
        return value;
    }

    public synchronized void put(int value) {
        while (isValuePresent) {
            try {
                this.wait();
            } catch (InterruptedException e) {}
        }
        this.value = value;
        isValuePresent = true;
        System.out.println("Put: " + value);
        this.notify();
    }
}

