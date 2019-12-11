package com.company;

import java.util.Scanner;

public class fibinocci_nonrec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int s1 = 1;
        int s2 = 1;
        int s3;
        System.out.print(s1 + " " + s2);

        for (int i = 3; i <= num; i++){
            s3 = s1 + s2;
            System.out.print(" " + s3);
            s1 = s2;
            s2 = s3;
         }
    }
}
