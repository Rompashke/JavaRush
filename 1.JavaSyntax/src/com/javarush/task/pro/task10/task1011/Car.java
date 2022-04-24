package com.javarush.task.pro.task10.task1011;

import java.util.Objects;

/* 
Создаем свой hashCode
*/

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public int hashCode() {
        return Objects.hash(model, year);
    }

    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini", 2020);
        Car lamborghini1 = new Car("Lamborghini", 2020);
        Car ferrari = new Car("Ferrari", 2020);
        Car ferrari1 = new Car("Ferrari", 2020);
        Car bugatti = new Car("Bugatti", 2020);
        Car bugatti1 = new Car("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
/*
Напиши свою реализацию hashCode, используя переменные model и year. Если эти поля у двух объектов одинаковые,
то должен возвращаться одинаковый hashCode. Если правильно реализовать метод hashCode, вывод должен быть таким:
true
true
true
true
false
false


Требования:
1.	Нельзя изменять метод main.
2.	В классе Car должен быть переопределен метод int hashCode().
3.	Реализуй метод hashCode так, что бы результат работы программы соответствовал условию.
 */
