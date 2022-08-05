package com.javarush.task.jdk13.task17.task1707;


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        synchronized (IMF.class) {
            if (imf == null) {
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {
    }
}

/*
Требования:
1.	Класс IMF должен содержать приватное статическое поле IMF imf.
2.	Класс IMF должен содержать приватный конструктор.
3.	Класс IMF должен содержать публичный статический метод IMF getFund().
4.	Метод getFund() должен содержать синхронизированный блок.
5.	Внутри синхронизированного блока должно быть проинициализировано поле imf.
6.	Метод getFund() должен всегда возвращать один и тот же объект.
 */
