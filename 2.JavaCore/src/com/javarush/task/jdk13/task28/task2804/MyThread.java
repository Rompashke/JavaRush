package com.javarush.task.jdk13.task28.task2804;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    private static volatile AtomicInteger threadPriority = new AtomicInteger(1);

    public synchronized void correctPriority() {
        int priority = threadPriority.getAndIncrement();
        if (getThreadGroup() != null && priority > getThreadGroup().getMaxPriority()) {
            priority = getThreadGroup().getMaxPriority();
        }
        setPriority(priority);
        if (threadPriority.intValue() > MAX_PRIORITY) {
            threadPriority.set(1);
        }
    }


    public MyThread() {
        super();
        correctPriority();
    }

    public MyThread(Runnable target) {
        super(target);
        correctPriority();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        correctPriority();
    }

    public MyThread(String name) {
        super(name);
        correctPriority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        correctPriority();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        correctPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        correctPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        correctPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
        super(group, target, name, stackSize, inheritThreadLocals);
    }


}

/*
В отдельном файле создай класс MyThread унаследовавшись от Thread. MyThread должен:
1. Иметь возможность быть созданным используя любой конструктор супер-класса  (Alt+Insert). (выполнено)
2. Приоритет у трэдов должен проставляться циклично от минимального значения до максимального значения.
3. если у трэда установлена трэд-группа(ThreadGroup), то приоритет трэда не может быть больше максимального приоритета
его трэд-группы.


Требования:
1.	Создай класс MyThread в отдельном файле. Унаследуй его от Thread.
2.	В классе MyThread должны присутствовать конструкторы, аналогичные конструкторам супер-класса.
3.	Приоритет у объектов MyThread должен проставляться циклично, от MIN_PRIORITY до MAX_PRIORITY.
4.	Если у объекта MyThread установлена ThreadGroup, приоритет MyThread не должен быть выше максимального приоритета ThreadGroup.
 */
