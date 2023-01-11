package com.javarush.task.jdk13.task38.task3803;

/* 
Обработка аннотаций
*/

import java.lang.annotation.Annotation;

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> c) {
        Annotation[] annotations = c.getDeclaredAnnotations();
        boolean flag = false;
        for (Annotation annotation : annotations) {
            if (annotation instanceof PrepareMyTest) {
                PrepareMyTest prepareMyTest = (PrepareMyTest) annotation;
                for (String fullyQualifiedName : prepareMyTest.fullyQualifiedNames()) {
                    System.out.println("fullyQualifiedNames: " + fullyQualifiedName);
                }
                flag = true;
            }
        }
        return flag;
    }

    public static <T> boolean printValues(Class<T> c) {
        Annotation[] annotations = c.getDeclaredAnnotations();
        boolean flag = false;
        for (Annotation annotation : annotations) {
            if (annotation instanceof PrepareMyTest) {
                PrepareMyTest prepareMyTest = (PrepareMyTest) annotation;
                for (Class<?> clazz : prepareMyTest.value()) {
                    System.out.println("value: " + clazz.getSimpleName());
                }
                flag = true;
            }
        }
        return flag;
    }
}
