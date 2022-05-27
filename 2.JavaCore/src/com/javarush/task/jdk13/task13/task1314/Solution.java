package com.javarush.task.jdk13.task13.task1314;

import java.util.ArrayList;
import java.util.List;

/* 
Репка
*/

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}

/*
Требования:
1.	Интерфейс RepkaItem должен быть реализован в классе Person.
2.	В классе Person должен быть реализован метод pull() c одним параметром типа Person.
3.	Метод pull в классе Person должен выводить на экран фразу типа &#39;&lt;name&gt;
за &lt;person&gt;&#39;. Например:             Бабка за Дедку.
4.	В результате выполнения метода main() на экран должен быть выведен краткий вариант сказки про Репку.
 */
