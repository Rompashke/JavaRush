package com.javarush.task.jdk13.task14.task1406;

/* 
Без ошибок
*/

import com.javarush.task.jdk13.task14.task1406.Solution.Mouse;

public class Solution {
    public static void main(String[] args) {
        Object obj = new Jerry();

                Mouse mouse = (Mouse) obj;
        GrayMouse grayMouse = (GrayMouse) mouse;
        Jerry jerry = (Jerry) grayMouse;

        printClasses(obj, mouse, grayMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(grayMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
    }

    static class Mouse {
    }

    static class GrayMouse extends Mouse {
    }

    static class Jerry extends GrayMouse {
    }
}

/*
Требования:
1.	Класс GrayMouse должен наследоваться от класса Mouse.
2.	Класс Jerry должен наследоваться от класса GrayMouse.
3.	В переменной obj должен храниться объект, который будет одновременно являться и Mouse, и GrayMouse, и Jerry.
4.	Метод main должен вызывать метод printClasses.
 */
