package com.javarush.task.pro.task15.task1530;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

/* 
Байты в символы
*/

public class Solution {

    public static void main(String[] args) {
        ByteArrayInputStream stream = new ByteArrayInputStream("O sole, o sole mio!\nSta 'nfronte a te!\n Sta 'nfronte a te!".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(bytesToChars(stream, 38)));
    }

    public static char[] bytesToChars(ByteArrayInputStream stream, int n) {
        byte[] bytes = stream.readAllBytes();
        int lengthOfMassiv = Math.min(n, bytes.length);
        char [] result = new char[lengthOfMassiv];
        for (int i = 0; i < lengthOfMassiv; i++) {
            result[i] =(char) bytes[i];
        }
        return result;
    }

}
