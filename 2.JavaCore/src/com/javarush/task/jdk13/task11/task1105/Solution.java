package com.javarush.task.jdk13.task11.task1105;

/* 
Неприступный кот
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }
    }
}

/*
Требования:
1.	Переменная name класса Cat должна быть скрыта.
2.	Переменная age класса Cat должна быть скрыта.
3.	Переменная weight класса Cat должна быть скрыта.
4.	В Cat должны быть private и public методы.
 */
