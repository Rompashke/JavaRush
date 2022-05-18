package com.javarush.task.jdk13.task11.task1113;

public class Laptop {

    private final String name;

    private final OperatingSystem os;

    public Laptop(String laptopName, String osName, String osVersion) {
        this.name = laptopName;
        this.os = new OperatingSystem(osName, osVersion);
    }

    public String getName() {
        return name;
    }

    public void updateOS(String version) {
        os.setVersion(version);
    }

    public void printInfo() {
        System.out.print(getName());
        System.out.print(", ");
        System.out.print(os.getName());
        System.out.print(", ");
        System.out.println(os.getVersion());

    }
}

/*
В Laptop нужно:
- добавить приватные неизменяемые поля String name и OperationSystem os;
- реализовать конструктор с тремя параметрами типа String, устанавливающий значения полям;
- добавить геттер для поля name;
- добавить метод public void updateOS(String version) который должен обновлять версию операционной системы;
- добавить метод public void printInfo() который должен выводить в консоль имя ноутбука, имя и версию операционной
системы в произвольном формате.
 */
