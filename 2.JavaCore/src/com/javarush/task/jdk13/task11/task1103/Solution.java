package com.javarush.task.jdk13.task11.task1103;

/* 
Скрытный инкапсулированный кот
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}

/*
Требования:
1.	Переменная name класса Cat должна быть скрыта.
2.	Переменная age класса Cat должна быть скрыта.
3.	Переменная weight класса Cat должна быть скрыта.
4.	В классе Cat должны быть 3 переменные.
5.	Все переменные класса Cat должны быть private.
 */

