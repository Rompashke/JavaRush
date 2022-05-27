package com.javarush.task.jdk13.task13.task1301;

/* 
Пиво
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {
        @Override
        public void askForMore(String message) {
            System.out.println("А можно еще пива?");
        }

        @Override
        public void sayThankYou() {
            System.out.println("Благодарю");

        }

        @Override
        public boolean isReadyToGoHome() {
                return Alcoholic.READY_TO_GO_HOME;

        }

        @Override
        public void sleepOnTheFloor() {
            System.out.println("Лег спать");
        }
    }
}

/*
Требования:
1.	Класс BeerLover должен реализовывать(implements) интерфейс Alcoholic.
2.	Класс BeerLover не должен реализовывать интерфейс Drinker напрямую (только опосредованно - через Alcoholic)
3.	В классе BeerLover должны быть реализованы все методы интерфейса Alcoholic.
4.	В классе BeerLover должны быть реализованы все методы интерфейса Drinker.
5.	Метод isReadyToGoHome должен возвращать значение переменной READY_TO_GO_HOME.
 */
