package com.javarush.task.jdk13.task34.task3410;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Обнуление объекта
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        User user = new User(28219, "Paulo", 40, 9999, "paulo@javarush.com");
        System.out.println(user);
        reset(user);
        System.out.println(user);
    }

    public static void reset(Object object) throws Exception {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        List<Field> declaredFieldsList = new ArrayList<>(Arrays.asList(fields));
        for (Field field: declaredFieldsList) {
            if (Modifier.isPrivate(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) &&
                    !field.getType().isPrimitive()) {
                field.setAccessible(true);
                field.set(object, null);
            }
        }

    }
}

//    Метод reset класса Solution должен &quot;обнулить&quot;
//        (присвоить null) все приватные/не статические/не примитивные поля объекта object.
//        Например, в примере приведенном в методе main должны &quot;обнулиться&quot; поля email и
//        friends.friends
