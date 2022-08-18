package com.assignment_03_intermediate;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter present value: ");
        double p = scan.nextDouble();
        System.out.print("Enter the interest rate: ");
        double r = scan.nextDouble();
        System.out.print("Enter the time period in years: ");
        double t = scan.nextDouble();

        double f = p * Math.pow((1 + r/100), t);
        System.out.print("Final Investment Value is: " + f);
    }
}
