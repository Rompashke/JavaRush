package com.javarush.task.jdk13.task28.task2802;

import java.util.concurrent.ThreadLocalRandom;

/*
ThreadLocalRandom
*/

public class Solution {
    public static int getRandomIntegerBetweenNumbers(int from, int to) {
        return ThreadLocalRandom.current().nextInt(from, to);
    }

    public static double getRandomDouble() {
        return ThreadLocalRandom.current().nextDouble();
    }

    public static long getRandomLongBetween0AndN(long n) {
        return ThreadLocalRandom.current().nextLong(n);
    }

    public static void main(String[] args) {
    }
}
/*
Требования:
1.	В классе Solution должны быть только статические методы.
2.	Метод getRandomIntegerBetweenNumbers с помощью ThreadLocalRandom должен возвращать случайный int [from..to].
3.	Метод getRandomDouble с помощью ThreadLocalRandom должен возвращать случайный double [0..1).
4.	Метод getRandomLongBetween0AndN с помощью ThreadLocalRandom должен возвращать случайный long [0..n].
 */
