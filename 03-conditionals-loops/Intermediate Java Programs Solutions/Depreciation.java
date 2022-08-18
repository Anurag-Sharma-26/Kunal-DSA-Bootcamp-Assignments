package com.assignment_03_intermediate;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount= scan.nextDouble();
        System.out.print("Enter the Depreciation Rate: ");
        double dep = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        long years = scan.nextLong();
        double temp;

        for(int i = 0; i < years; i++) {
            temp = (dep / 100) * amount;
            amount -= temp;
        }
        System.out.println("After Depreciation: " + amount);
    }
}
