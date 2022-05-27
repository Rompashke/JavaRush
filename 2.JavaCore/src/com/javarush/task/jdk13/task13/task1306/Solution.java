package com.javarush.task.jdk13.task13.task1306;

/* 
Будущий управленец
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends Person, HasManagementPotential{
    }

    class Manager implements Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}

/*
Требования:
1.	Класс Manager должен реализовывать подходящий ему интерфейс (Secretary или Boss).
2.	Класс Subordinate должен реализовывать подходящий ему интерфейс (Secretary или Boss).
3.	Секретарь (Secretary) является человеком (Person).
4.	Начальник (Boss) является человеком (Person), который
может заставить других усердно работать (HasManagementPotential).
 */
