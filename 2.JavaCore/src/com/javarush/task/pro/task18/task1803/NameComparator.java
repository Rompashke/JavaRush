package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {
    public int compare(JavaRushMentor mentor1, JavaRushMentor mentor2) {
        return mentor1.getName().length() - mentor2.getName().length();
    }
}

/*
Требования:
1.	В классе NameComparator нужно реализовать интерфейс Comparator&lt;JavaRushMentor&gt;.
2.	В классе NameComparator нужно создать публичный метод int compare(JavaRushMentor, JavaRushMentor).
3.	Метод compare(JavaRushMentor, JavaRushMentor) нужно реализовать согласно условию.
 */
