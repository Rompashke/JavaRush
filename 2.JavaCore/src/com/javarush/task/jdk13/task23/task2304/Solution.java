package com.javarush.task.jdk13.task23.task2304;

/* 
Напряги извилины!
*/

public class Solution {
    private String name;

    Solution(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    private void sout() {
        new Solution("The Darkside Hacker") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Solution("Риша").sout();
    }
}

/*

Метод printName должен выводить имя собственного объекта, т.е. &quot;The Darkside Hacker&quot;.
Сделайте минимум изменений.


Требования:
1.	Вывод на экран должен соответствовать условию.
2.	В классе Solution должен присутствовать метод sout без параметров.
3.	В классе Solution должно присутствовать поле name.
4.	Модификатор доступа метода getName должен быть расширен.
 */
