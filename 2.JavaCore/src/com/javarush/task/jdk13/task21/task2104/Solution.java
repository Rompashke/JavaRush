package com.javarush.task.jdk13.task21.task2104;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Глубокое клонирование карты
*/

public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        try {
            Solution clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Solution obj = (Solution) super.clone();
        // клонирование мапы
        Map<String, User> newUsers = new LinkedHashMap<>();
        for (String key: obj.users.keySet()) {
            User user = obj.users.get(key);
            newUsers.put(key, (User) user.clone());
        }
        obj.users = newUsers;
        return obj;
    }

    protected Map<String, User> users = new LinkedHashMap<>();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj.getClass().equals(this.getClass()))) {
                return false;
            }
             User user = (User) obj;

            if (user.age != this.age) {
                return false;
            }

            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }
}

/*
Требования:
1.	Класс Solution должен поддерживать интерфейс Cloneable.
2.	Класс User должен поддерживать интерфейс Cloneable.
3.	В классе User должен быть корректно реализован метод clone.
4.	В классе Solution должен быть корректно реализован метод clone.
 */
