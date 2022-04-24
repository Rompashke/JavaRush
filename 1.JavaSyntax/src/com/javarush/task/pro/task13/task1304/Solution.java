package com.javarush.task.pro.task13.task1304;

import java.util.*;

/* 
Переводим итератор в цикл for-each
*/

public class Solution {

    public static void printList(ArrayList<String> words) {
        /*
        for (Iterator<String> iterator = words.iterator(); iterator.hasNext(); ) {
            String word = iterator.next();
            System.out.println(word);
        }
         */
        for (String str: words) {
            System.out.println(str);
        }
    }

    public static void printHashSet(HashSet<String> words) {
//        Iterator<String> iterator = words.iterator();
//        while (iterator.hasNext()) {
//            String word = iterator.next();
//            System.out.println(word);
//        }
        for (String str: words) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}

/*

Требования:
1.	В классе Solution должен быть публичный статический метод printHashSet(HashSet&lt;String&gt;) с типом возвращаемого значения void.
2.	В классе Solution должен быть публичный статический метод printList(ArrayList&lt;String&gt;) с типом возвращаемого значения void.
3.	Метод printHashSet(HashSet&lt;String&gt;) должен выводить все элементы с помощью цикла for-each.
4.	Метод printList(ArrayList&lt;String&gt;) должен выводить все элементы с помощью цикла for-each.
 */
