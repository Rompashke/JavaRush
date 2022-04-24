package com.javarush.task.pro.task15.task1531;

import java.io.*;
import java.util.Base64;

/* 
Закрыть нельзя оставить
*/

public class Solution {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            String string = toString(new MyClass("Съешь ещё этих мягких французских булок."));
            System.out.printf("Объект в виде строки: %s\n", string);

            MyClass myClass = (MyClass) fromString(string);
            System.out.println("Восстановленный объект: " + myClass);

            System.out.println();
            fromString("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String toString(Serializable o) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(o);
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        }
    }

    public static Object fromString(String s) throws IOException, ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(s);

        try (MyStream ms = new MyStream(data); ObjectInputStream ois = new ObjectInputStream(ms)) {
            Object o = ois.readObject();
            return o;
        }
    }
}
/*
Требования:
1.	Функционал метода fromString не должен изменится, если в него передана валидная строка.
2.	Метод fromString должен пробрасывать дальше возникающие исключения (не перехватывать).
3.	Метод fromString должен вызвать метод close у объекта MyStream, если в fromString была передана пустая строка.
 */
