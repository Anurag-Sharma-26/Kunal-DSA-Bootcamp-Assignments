package com.assignment_04;

import java.util.Scanner;

public class PalindromeNumberFunc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        System.out.println(num + PalindromeNumber(num));

    }
    static String PalindromeNumber(int num) {
        int revNum = 0;
        int temp = num;
        int c;

        while (temp > 0){
            c = temp % 10;
            revNum = revNum * 10 + c;
            temp /= 10;
        }
        if(num == revNum) return " is Palindrome.";
        return " is not Palindrome.";
    }
}
