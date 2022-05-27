package com.javarush.task.jdk13.task13.task1305;

/* 
Всё, что движется
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly i);
    }
}

/*
Требования:
1.	В классе Solution должен быть объявлен интерфейс CanMove.
2.	В классе Solution должен быть объявлен интерфейс CanFly.
3.	Интерфейс CanFly должен наследоваться от интерфейса CanMove.
4.	В интерфейсе CanMove должен быть объявлен метод speed без параметров и с типом возвращаемого значения Double.
5.	В интерфейсе CanFly должен быть объявлен метод speed c одним аргументом типа CanFly и с типом
возвращаемого значения Double.
 */