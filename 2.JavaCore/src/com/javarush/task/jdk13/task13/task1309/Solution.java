package com.javarush.task.jdk13.task13.task1309;

/* 
Neo
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }
}

/*
Требования:
1.	Интерфейс DBObject должен быть реализован в классе User.
2.	Метод initializeIdAndName должен возвращать корректный объект типа User, объект на котором
производится вызов метода(&quot;этот&quot; объект).
3.	Метод initializeIdAndName должен устанавливать значения полей id и name согласно переданным ему параметрам.
4.	Программа должна выводить на экран: &quot;The user&#39;s name is Neo, id = 1&quot;.
5.	Метод toString не менять.
6.	Метод main не менять.
 */
