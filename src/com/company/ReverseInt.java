//
// Time Complexity : O(n)
// Space Complexity: O(n)
//
package com.company;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();
        int rev_num = reverseNumber(num);
        if (rev_num > Integer.MAX_VALUE || rev_num < Integer.MIN_VALUE) {
            System.out.println(rev_num + "Error. Integer Overflow");
        } else {
            System.out.println("Reversed Number is " + rev_num);
        }
    }

    public static int reverseNumber(int num){
        int last_digit;
        int rev_num = 0;

        while (num != 0){
            rev_num = ((rev_num * 10) + (num % 10));
            num = num / 10;
        }

        return rev_num;
    }
}
