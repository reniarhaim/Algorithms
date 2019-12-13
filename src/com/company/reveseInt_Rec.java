//
// Time Complexity : O(n)
// Space Complexity: O(n)
//
package com.company;

import java.util.Scanner;

public class reveseInt_Rec {

    public static int rev_num = 0;

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
        if(num > 0){
            rev_num = ((rev_num * 10) + (num % 10));
            num = num / 10;
            reverseNumber(num);
        }
        return rev_num;
    }
}
