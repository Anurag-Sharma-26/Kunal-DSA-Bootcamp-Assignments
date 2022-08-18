package com.assignment_03_intermediate;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the units shown in meter: ");
        double units = scan.nextDouble();
        System.out.println("Standard rate is 3 Rs per unit.");
        double costPerUnit = 3;

        System.out.println("Total Bill Amount is: " + (units * costPerUnit) + " Rs");

    }
}
