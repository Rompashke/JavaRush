package com.javarush.task.jdk13.task34.task3402;

/* 
Факториал с помощью рекурсии
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.factorial(9));     //362880
        System.out.println(solution.factorial(0));     //1
        System.out.println(solution.factorial(1));     //1
    }

    public int factorial(int n) {
        /*
        int result = 1;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        return result;
        */
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

/*
Требования:
1.	В классе Solution не должны быть созданы дополнительные поля.
2.	Метод factorial должен возвращать факториал числа принятого в качестве параметра.
3.	Метод factorial не должен быть статическим.
4.	Метод factorial должен быть рекурсивным.
 */
