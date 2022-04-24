package com.javarush.task.pro.task10.task1004;

/* 
Жажда скорости
*/

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Оранжевый";
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Оранжевый";
    }
}

/*
Требования:
1.	В классе CarConcern должно быть четыре приватных final поля.
2.	В классе CarConcern должен быть публичный конструктор с тремя параметрами, который инициализирует соответствующие поля.
3.	В классе CarConcern должен быть публичный конструктор с двумя параметрами, который инициализирует соответствующие поля.
4.	В классе CarConcern должен быть публичный конструктор с одним параметром, который инициализирует соответствующие поля.
 */