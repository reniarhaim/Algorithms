package com.company;

import java.util.Scanner;

public class Fibinocci {

    public static int fib(int i){
        if (i == 0){
            return 1;
        }
        else if (i == 1){
            return 1;
        }
        else {
            return fib(i-1) + fib(i-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fib(num));
    }
}
