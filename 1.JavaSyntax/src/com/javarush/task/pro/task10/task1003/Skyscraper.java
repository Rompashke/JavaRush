package com.javarush.task.pro.task10.task1003;

/* 
Построим новый бизнес-комплекс JavaRush Business Center
*/

public class Skyscraper {
    private int floorsCount;
    private String developer;

    public Skyscraper(){
     this.floorsCount = 5;
     this.developer = "JavaRushDevelopment";
    }
    public Skyscraper(int floorsCount, String developer){
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Неизвестно");
    }
}

/*
Требования:
•	В классе Skyscraper должно быть два публичных конструктора.
•	В классе Skyscraper должен быть конструктор без параметров.
•	В классе Skyscraper должен быть конструктор с параметрами типа int и типа String.
•	В классе Skyscraper должно быть приватное не статическое поле типа int с названием floorsCount.
•	В классе Skyscraper должно быть приватное не статическое поле типа String с названием developer.
•	В конструкторе без параметров поля должны инициализироваться значениями "5" и "JavaRushDevelopment".
•	В конструкторе c параметрами поля должны инициализироваться аргументами этого конструктора.
 */
