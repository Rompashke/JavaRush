package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths(){
        Month[] months = {DECEMBER, JANUARY, FEBRUARY};
        return months;
    }
    public static Month[] getSpringMonths(){
        Month[] months = {MARCH, APRIL, MAY};
        return months;
    }
    public static Month[] getSummerMonths(){
        Month[] months = {JUNE, JULY, AUGUST};
        return months;
    }
    public static Month[] getAutumnMonths(){
        Month[] months = {SEPTEMBER, OCTOBER, NOVEMBER};
        return months;
    }

}
/*
Требования:
1.	Публичный статический метод getWinterMonths() должен возвращать массив с зимними месяцами.
2.	Публичный статический метод getSpringMonths() должен возвращать массив с весенними месяцами.
3.	Публичный статический метод getSummerMonths() должен возвращать массив с летними месяцами.
4.	Публичный статический метод getAutumnMonths() должен возвращать массив с осенними месяцами.
 */
