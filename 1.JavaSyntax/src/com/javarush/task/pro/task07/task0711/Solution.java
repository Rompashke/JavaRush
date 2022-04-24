package com.javarush.task.pro.task07.task0711;

/* 
Гибкое заполнение массива
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        Arrays.fill(array, begin, end, value);
    }
}

/*
Иногда необходимо заполнить какую-то часть массива одинаковыми значениями или же удалить
существующие (присвоить значение null).
Реализуй для этого более гибкий метод fillArray(Integer[] array, int value, int begin, int end), где:
- array &mdash; массив, который необходимо заполнить;
- value &mdash; значение, которым необходимо заполнить;
- begin &mdash; начиная с какого индекса необходимо заполнять (включительно);
- end &mdash; на каком индексе остановить заполнение (исключая).


Требования:
1.	Метод fillArray(Integer[] array, int value, int begin, int end) должен заполнять переданный в него массив значением value.
2.	Метод fillArray(Integer[] array, int value, int begin, int end) должен заполнять только элементы от индекса begin(включительно) до индекса end (исключая).

 */
