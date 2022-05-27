package com.javarush.task.jdk13.task35.task3507;

import java.util.*;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static <T> ArrayList<T> newArrayList(T[] elements) {
        ArrayList<T> list = new ArrayList<>(elements.length);
        Collections.addAll(list, elements);
        return list;
    }

    public static <T> HashSet<T> newHashSet(T[] elements) {
        HashSet<T> set = new HashSet<>(elements.length);
        Collections.addAll(set, elements);
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException();
        }
        HashMap<K, V> map = new HashMap<>();

        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }
}

/*
Требования:
1.	Метод newArrayList должен быть параметризован типом Т.
2.	Метод newArrayList должен возвращать ArrayList, который содержит переданные в метод объекты.
3.	Метод newHashSet должен быть параметризован типом Т.
4.	Метод newHashSet должен возвращать HashSet, который содержит переданные в метод объекты.
5.	Метод newHashMap должен быть параметризован типом K и V.
6.	Метод newHashMap должен возвращать HashMap, который содержит переданные в метод ключи и значения.
7.	Метод newHashMap должен кидать IllegalArgumentException, если списки ключей и значений не совпадают по размеру.
 */
