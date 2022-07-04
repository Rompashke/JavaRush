package com.javarush.task.jdk13.task34.task3403;

/* 
Разложение на множители с помощью рекурсии
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.recurse(132);
    }
    public void recurse(int n) {
        if (n > 1) {
            int devider = 2;
            boolean isSimple = true;
            while (isSimple) {
                if (n % devider == 0) {
                    System.out.print(devider + " ");
                    recurse(n / devider);
                    isSimple = false;
                } else {
                    devider++;
                }
            }
        }
    }
}
