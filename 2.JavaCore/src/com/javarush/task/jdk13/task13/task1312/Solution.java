package com.javarush.task.jdk13.task13.task1312;

import java.awt.*;

/* 
Один метод в классе
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal {

        public String getName() {
            return "Fox";
        }

    }


}

/*
Требования:
1.	Интерфейс Animal должен быть реализован в классе Fox.
2.	В классе Fox должен быть реализован только один метод &mdash; getName.
3.	Интерфейс Animal изменять нельзя.
4.	Дополнительные классы или интерфейсы создавать нельзя.
 */
