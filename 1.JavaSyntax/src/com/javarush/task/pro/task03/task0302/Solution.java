package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner scanName = new Scanner(System.in);
        String myName = scanName.nextLine();
        Scanner scanAge = new Scanner(System.in);
        int myAge = scanAge.nextInt();
        if (myAge > 17 & myAge < 29) {
            System.out.println(myName + militaryCommissar);
        }
    }
}
