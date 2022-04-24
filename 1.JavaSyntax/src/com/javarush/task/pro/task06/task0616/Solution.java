package com.javarush.task.pro.task06.task0616;

/* 
Учет работников
*/

public class Solution {
    public String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
//1. Метод setPosition() должен устанавливать полученное значение переменной класса position.
//        2. Метод setSalary() должен устанавливать полученное значение переменной класса salary.
//        3. Изменять имена переменных класса нельзя.
//        4. Изменять имена параметров методов нельзя.