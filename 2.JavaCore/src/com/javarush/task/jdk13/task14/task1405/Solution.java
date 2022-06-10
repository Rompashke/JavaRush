package com.javarush.task.jdk13.task14.task1405;

/* 
Пора покушать
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        food.onSelect();
        food.onEat();
    }

    public static void callSelectableMethods(Selectable selectable) {
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {

        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }

        public void onEat() {
            System.out.println("The food was eaten");
        }
    }
}

/*
Требования:
1.	Интерфейс Selectable должен быть реализован в классе Food.
2.	Метод onSelect() в классе Food должен выводить на экран фразу &quot;The food was selected&quot;.
3.	В методе callFoodMethods должны вызываться методы объекта типа Food.
4.	В методе callSelectableMethods должны вызываться методы доступные у любого объекта реализующего
интерфейс Selectable.
 */
