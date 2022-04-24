package com.javarush.task.pro.task13.task1326;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyQueue extends AbstractQueue<String> {

    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        return values.listIterator();
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public boolean offer(String o) {
        values.add(o);
        return values.contains(o);

    }

    @Override
    public String poll() {
        if (values.isEmpty()) {
            return null;
        } else {
            String i = values.get(0);
            values.remove(0);
            return i;
        }
    }

    @Override
    public String peek() {
        if (values.isEmpty()) {
            return null;
        } else return values.get(0);

    }
}
/*
Требования:
1.	Метод iterator должен вернуть listIterator() списка values.
2.	Метод size должен вернуть размер списка values.
3.	Метод offer должен добавить новый элемент в конец списка values и вернуть true.
4.	Метод poll должен вернуть элемент с индексом 0 в списке values и удалить его из списка. Если список пустой, то вернуть null.
5.	Метод peek должен просто вернуть элемент с индексом 0 в списке values. Если список пустой, то вернуть null.
 */
