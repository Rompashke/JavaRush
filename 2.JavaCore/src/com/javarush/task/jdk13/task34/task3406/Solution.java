package com.javarush.task.jdk13.task34.task3406;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

/* 
Классные методы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        print(getMethods(Set.of(Object.class, Math.class, Arrays.class)));
    }

    public static Map<Class<?>, Set<String>> getMethods(Set<Class<?>> classes) {
        Map<Class<?>, Set<String>> resultMap = new HashMap<>(); // create map
        for (Class<?> clazz : classes) { // перебор множества classes
            Set<String> staticMethodsOfClazz = new HashSet<>(); // создаем множество для значения мапы
            resultMap.put(clazz, staticMethodsOfClazz);
            for (Method methodOfClazz : clazz.getDeclaredMethods()) { // проходимся по всем методам класса
                if (Modifier.isStatic(methodOfClazz.getModifiers())) { // условие статичности
                    staticMethodsOfClazz.add(methodOfClazz.getName()); // если статик то добавляем в множество
                }
            }
        }
        return resultMap;
    }

    public static void print(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
