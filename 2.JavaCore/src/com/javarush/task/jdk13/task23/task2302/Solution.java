package com.javarush.task.jdk13.task23.task2302;

/* 
Как выбрать нужное?
*/

public class Solution {
    public static final String TEST = "test";
    static Object obj;

    public static void main(String[] args) {
        obj = new Solution.TEST();
        System.out.println(obj);
    }

    public static class TEST {
        @Override
        public String toString() {
            return "test class";
        }
    }
}

/*
В методе main присвой объекту Object obj экземпляр класса TEST.
Не изменяй ничего кроме метода main.


Требования:
1.	В классе Solution должно существовать поле TEST.
2.	В классе Solution должен существовать класс TEST.
3.	В классе Solution должно существовать поле obj.
4.	В методе main в поле obj должен быть сохранен объект типа TEST(экземпляр класса TEST).
 */
