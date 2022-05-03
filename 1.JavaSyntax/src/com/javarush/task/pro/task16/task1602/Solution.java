package com.javarush.task.pro.task16.task1602;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Подчищаем хвосты
*/

public class Solution {

    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date(2015, 12, 25, 20, 40));
        dateList.add(new Date("July 20, 1969"));
        dateList.add(new Date(1989, 11, 9));
        dateList.add(new Date("January 1, 2000"));

        System.out.println("before fixes:");
        dateList.forEach(System.out::println);

        fixDate(dateList);

        System.out.println("after fixes:");
        dateList.forEach(System.out::println);
    }

    static void fixDate(List<Date> brokenDates) {
        /*
        Date nowDate = new Date();
        for (int i = 0; i < brokenDates.size(); i++) {
            if (brokenDates.get(i).getTime() > nowDate.getTime()) {
                int fixYear  = brokenDates.get(i).getYear() - 1900;
                int fixMonth = brokenDates.get(i).getMonth() - 1;
                Date fixDate = new Date(fixYear, fixMonth, brokenDates.get(i).getDate(),
                        brokenDates.get(i).getHours(), brokenDates.get(i).getMinutes());
                brokenDates.set(i, fixDate);
            }
        } */
        Date current = new Date();
        for (Date date: brokenDates) {
            if (date.after(current)) {
                date.setYear(date.getYear() - 1900);
                date.setMonth(date.getMonth() - 1);
            }
        }
    }
}
