package com.javarush.task.pro.task15.task1532;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* 
Шифр
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        byte[] byteMessage = message.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < byteMessage.length / 2; i++) {
            stream.write(byteMessage[i]);
            stream.write(byteMessage[byteMessage.length - i - 1]);
        }
        if (byteMessage.length % 2 == 1) {
            stream.write(byteMessage[byteMessage.length / 2]);
        }
        return stream;
    }
}
/*
Требования:
1.	Метод encrypt должен возвращать поток содержащий все байты из строки message.
2.	В возвращенном потоке байты должны быть перемешаны в соответствии с условием.
 */
