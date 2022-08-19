package com.assignment_04;

import java.util.Scanner;

public class EvenOddFunc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        System.out.println("The number is " + EvenOdd(num));

    }

    static String EvenOdd(int num) {
        if(num % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
}
