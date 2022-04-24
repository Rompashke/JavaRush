package com.javarush.task.pro.task11.task1102;

/* 
Земля: техническая характеристика
*/

public class Solution {

    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
/*
1.	Все переменные класса Planet должны быть не статическими.
2.	В методе main должны присваиваться значения всем переменным объекта Planet earth.
 */