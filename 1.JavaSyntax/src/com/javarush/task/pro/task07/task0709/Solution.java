package com.javarush.task.pro.task07.task0709;

/* 
Очень правильные типы
*/

public class Solution {
    long a = 109 + 15;
    int b = (int) a * 2;
    short c = (short) (a / b);
    byte d = (byte) (a + b - c);
}
/*
Расставь операторы приведения типов в выражениях таким образом, чтобы код компилировался.
Изменять типы переменных a,b,c и d нельзя.


Требования:
1.	Типы переменных a,b,c и d не должны измениться.
2.	При присвоении значения выражения должно использоваться приведение типа.
 */
