package com.company;

import java.util.Scanner;

public class factorial_nonrec {
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();
        int fact = 1;

        for (int i=num; i >=1; i--){
//            fact = fact * i;
            fact *= i;
        }

        System.out.println("Factorial is :" + fact);
    }
}

