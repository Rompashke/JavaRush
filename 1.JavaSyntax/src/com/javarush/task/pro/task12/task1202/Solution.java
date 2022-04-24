package com.javarush.task.pro.task12.task1202;

/* 
Распаковка
*/

public class Solution {
    Byte byteValueBox;
    Short shortValueBox;
    Integer integerValueBox;
    Long longValueBox;

    Float floatValueBox;
    Double doubleValueBox;

    Character characterValueBox;
    Boolean booleanValueBox;

    byte byteValue = byteValueBox.byteValue();
    short shortValue = shortValueBox.shortValue();
    int intValue = integerValueBox.intValue();
    long longValue = longValueBox.longValue();

    float floatValue = floatValueBox.floatValue();
    double doubleValue = doubleValueBox.doubleValue();

    char charValue = characterValueBox.charValue();
    boolean booleanValue = booleanValueBox.booleanValue();
}
/*
В классе Solution представлены 8 объектов-оберток примитивных типов с именами вида типValueBox.
Для каждого из этих объектов-оберток необходимо создать переменные соответствующего примитивного типа и присвоить им имена вида типValue.
Для создания переменной используй метод объекта-обертки типValueBox.примитивValue().
Пример переменной примитивного типа:
int intValue = ....;


Требования:
1.	В классе Solution должны быть 8 объектов типа класс-обертка примитивного типа с именами вида типValueBox.
2.	В классе Solution должны быть 8 переменных примитивных типов данных с именами вида типValue.
3.	При создании переменных примитивных типов должны использоваться существующие объекты-обертки и метод типValueBox.примитивValue().

 */
