package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Гвинно");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name) && name != null) {
            alreadyGotSalaryEmployees.add(name);
            int i = waitingEmployees.indexOf(name);
            waitingEmployees.set(i, null);
        }
    }
}

/*
Требования:
1.	Метод paySalary(String) должен добавлять в список alreadyGotSalaryEmployees имя сотрудника, если он есть в списке waitingEmployees.
2.	Метод paySalary(String) должен заменять имя сотрудника на значение null, если он есть в списке waitingEmployees.
3.	Метод paySalary(String) не должен изменять списки waitingEmployees и alreadyGotSalaryEmployees, если переданного имени нет в списке waitingEmployees.
4.	Если в метод paySalary(String) передается null, метод не должен добавлять это значение в waitingEmployees или alreadyGotSalaryEmployees.
 */
