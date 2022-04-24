package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
/*
Требования:
        1.	В методе main класса Solution должен быть создан объект класса Inner.
        2.	В методе main класса Solution должен быть создан объект класса Nested.
        3.	Класс Outer изменять нельзя.
 */
