package com.javarush.task.pro.task10.task1007;

/* 
С крышей или без? Вот в чем вопрос
*/

public class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    public Bugatti() {

    }
    public String getBody() { //публичный геттер для body
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
}
/*
Требования:
1.	В классе Bugatti должно быть три поля: String color, int year, String body.
2.	В классе Bugatti должен быть конструктор по умолчанию.
3.	В классе Bugatti должен быть публичный геттер getBody для поля body.
4.	В классе Bugatti должен быть публичный сеттер setBody(String) для поля body.
 */
