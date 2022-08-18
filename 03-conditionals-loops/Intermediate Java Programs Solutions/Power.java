package com.assignment_03_intermediate;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Base and Exponent: ");
        int b = scan.nextInt();
        int exp = scan.nextInt();

        double result = Math.pow(b, exp);
        System.out.println("Result is: " + result);
    }

}
