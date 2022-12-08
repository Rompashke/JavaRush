package com.javarush.task.jdk13.task34.task3408;


public class Generator<T> {

    public Generator(Class<T> aClass) {
        this.aClass = aClass;
    }

    Class<T> aClass;

    T newInstance() throws Exception {
        return aClass.getDeclaredConstructor().newInstance();
    }
}
