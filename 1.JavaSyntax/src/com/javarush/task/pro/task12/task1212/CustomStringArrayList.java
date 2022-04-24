package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        this.capacity = 10;
        this.size = 0;
        this.elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        double doubleToInt = this.capacity * 1.5;
        this.capacity = (int) doubleToInt;
        this.elements = Arrays.copyOf(this.elements, this.capacity);
    }
}

/*
Требования:
1.	В классе CustomStringArrayList должны быть не статические приватные поля int size, int capacity, String[] elements.
2.	В классе CustomStringArrayList должен быть конструктор без параметров, который инициализирует поле size значением 0, поле capacity &mdash; значением 10, поле elements &mdash; новым массивом с размером capacity.
3.	В классе CustomStringArrayList должен быть метод public void add(String).
4.	В классе CustomStringArrayList должен быть метод private void grow().
5.	Метод grow() должен работать согласно условию.
6.	Метод add(String) изменять нельзя.
 */
