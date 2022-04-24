package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        if (console.hasNextInt()) {
            int n = console.nextInt();
            if (n > 0) {
                int[] reverseMas = new int[n];
                for (int i = 0; i < reverseMas.length; i++) {
                    reverseMas[i] = console.nextInt();
                }
                if (n % 2 == 0) {
                    for (int i = reverseMas.length - 1; i >= 0; i--) {
                        System.out.println(reverseMas[i]);
                    }
                } else {
                    for (int i = 0; i < reverseMas.length; i++) {
                        System.out.println(reverseMas[i]);
                    }
                }
            }
        }
    }
}
