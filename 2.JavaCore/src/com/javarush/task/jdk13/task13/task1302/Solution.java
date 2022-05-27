package com.javarush.task.jdk13.task13.task1302;

/* 
Selectable и Updatable
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable {
        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}

/*
Требования:
1.	Класс Screen должен реализовывать (implements) интерфейс Selectable.
2.	Класс Screen должен реализовывать (implements) интерфейс Updatable.
3.	В классе Screen должны быть реализованы методы интерфейса Selectable.
4.	В классе Screen должны быть реализованы методы интерфейса Updatable.
 */
