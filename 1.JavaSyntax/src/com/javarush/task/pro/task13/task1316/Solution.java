package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] questList = JavarushQuest.values();
        for (JavarushQuest value: questList) {
            System.out.println(value.ordinal());
        }
    }
}
/*
Требования:
1.	В методе main получи список всех констант из enum JavarushQuest с помощью метода values().
2.	В методе main выведи порядковый номер каждого элемента с новой строки, используя метод ordinal().
 */
