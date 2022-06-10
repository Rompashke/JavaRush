package com.javarush.task.jdk13.task14.task1404;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Коты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        boolean bool = true;
        while (bool) {
            String catName = buffReader.readLine();
            if (catName.equals("")) {
                bool = false;
                continue;
            }
            Cat cat = CatFactory.getCatByKey(catName);
            System.out.println(cat.toString());
        }
        buffReader.close();
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat = new MaleCat("Василий");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kiska":
                    cat = new FemaleCat("Кисюлька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}

/*
Требования:
1.	Программа должна считывать данные с клавиатуры.
2.	Программа должна прекращать считывать данные после ввода пустой строки.
3.	Программа должна выводить на экран описание каждого кота (cat.toString).
4.	Программа должна создавать объект класса Cat для каждого введенного имени кота
(строки, считанной с клавиатуры) c помощью метода getCatByKey.
 */
