package com.javarush.task.jdk13.task13.task1304;

/* 
Эй, ты там живой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        boolean isAlive();
    }

    interface Presentable extends Person {

    }
}

/*
Требования:
1.	В классе Solution должен быть объявлен интерфейс Person.
2.	В классе Solution должен быть объявлен интерфейс Presentable.
3.	Интерфейс Presentable должен наследоваться от интерфейса Person.
4.	В интерфейсе Person должен быть объявлен метод isAlive.
5.	Тип возвращаемого значения метода isAlive может иметь только два значения.
 */