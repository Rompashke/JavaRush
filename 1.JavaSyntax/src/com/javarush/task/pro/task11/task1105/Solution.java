package com.javarush.task.pro.task11.task1105;

/* 
Оконные работы
*/

public class Solution {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
/*
Требования:
1.	Объявление и инициализацию полей класса Window изменять нельзя.
2.	Метод changeSize класса Window должен изменять значения полей класса согласно переданным данным.
3.	Объявление метода changeSize и названия параметров изменять нельзя.
 */
