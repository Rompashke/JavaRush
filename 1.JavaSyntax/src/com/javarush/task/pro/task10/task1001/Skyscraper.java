package com.javarush.task.pro.task10.task1001;

/* 
Создадим небоскреб
*/

public class Skyscraper {

    public Skyscraper() {
        System.out.println("Небоскреб построен.");
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();

    }
}
/*
Попробуем сконструировать свой первый небоскреб и объявить о результате выполнения в консоли. Для этого тебе нужно
вызвать конструктор класса Skyscraper в методе main и в теле конструктора вывести в консоль текст &quot;Небоскреб построен.&quot;.


Требования:
1.	В классе Skyscraper должен быть публичный конструктор без параметров.
2.	В методе main тебе нужно создать один объект класса Skyscraper.
3.	В конструкторе класса Skyscraper должен выводиться текст &quot;Небоскреб построен.&quot; в консоль.
 */