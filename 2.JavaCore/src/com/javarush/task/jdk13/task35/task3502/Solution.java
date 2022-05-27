package com.javarush.task.jdk13.task35.task3502;

import java.util.List;

/* 
Знакомство с дженериками
*/

public class Solution <Class2 extends List<Solution.SomeClass>>{
    public static void main(String[] args) {

    }

    public static class SomeClass <Class1 extends Number> {
    }
}

/*
Требования:
1.	Класс SomeClass должен работать с типами которые наследуются от Number.
2.	Класс Solution должен работать с типами, которые наследуются от List, который в свою очередь параметризируется типом SomeClass.
3.	Класс SomeClass должен быть публичным.
4.	Класс SomeClass должен быть статическим.
5.	Класс SomeClass должен находиться внутри класса Solution.
 */
