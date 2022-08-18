package com.assignment_03_intermediate;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal value: ");
        double p = scan.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double r = scan.nextDouble();
        System.out.print("Enter the Time (in years): ");
        double t = scan.nextDouble();
        System.out.print("Enter the Number of times Interest Compounded in 1 year: ");
        double num = scan.nextDouble();

        double result = p * (Math.pow((1 + (r / ( num * 100))), (num * t))) - p;
        System.out.println();
        System.out.println("Total Compound Interest is: " + result);

    }

}
