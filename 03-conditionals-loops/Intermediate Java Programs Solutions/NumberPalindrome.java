package com.assignment_03_intermediate;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int revNum = 0;
        int temp = num;
        int c;

        while (temp > 0){
            c = temp % 10;
            revNum = revNum * 10 + c;
            temp /= 10;
        }
        if(num == revNum){
            System.out.println(num + " is Palindrome.");
        }
        else {
            System.out.println(num + " is not Palindrome.");
        }
    }
}
