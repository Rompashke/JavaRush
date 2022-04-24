package com.javarush.task.pro.task12.task1221;

import java.util.ArrayList;

/* 
Дженерики и студенты
*/

public class Faculty {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Акакий"));
        students.add(new Student("Любослав"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
/*
Требования:
1.	Исправь сигнатуру метода printStudentNames, чтобы он принимал список только студентов.
2.	Реализацию метода printStudentNames не изменять.
 */
