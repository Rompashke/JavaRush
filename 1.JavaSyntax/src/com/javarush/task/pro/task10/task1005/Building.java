package com.javarush.task.pro.task10.task1005;

/* 
Многосерийный предприниматель
*/

public class Building {
    private String type;


    public void initialize(String str){
        this.type = str;
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}

/*
Требования:
1.	В классе Building должно быть приватное поле type типа String.
2.	В классе Building не должно быть объявленных конструкторов.
3.	В классе Building должен быть не статический метод public void initialize с параметром типа String.
4.	Инициализация поля type должна быть в методе initialize(String).
 */
