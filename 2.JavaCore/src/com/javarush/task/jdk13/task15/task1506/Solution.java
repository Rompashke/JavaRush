package com.javarush.task.jdk13.task15.task1506;

/* 
Максимально простой код-2
*/

public class Solution {
    public static void main(String[] args) {
        SiamCat simka = new SiamCat("Simka");
        NakedCat nakedSimka = simka.shave();
    }

    public static class NakedCat {
//        public NakedCat() {
//            super();
//        }
    }

    public static class NormalCat extends NakedCat {
        public NormalCat() {
//            super();
        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}

/*
Требования:
1.	Класс NormalCat должен быть потомком класса NakedCat.
2.	Класс SiamCat должен быть потомком класса NormalCat.
3.	Упрости код класса NakedCat.
4.	Упрости код класса NormalCat.
 */