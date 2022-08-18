package com.assignment_03_intermediate;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Total sale value: ");
        double saleAmount = scan.nextDouble();
        System.out.println("Commission is 3% of total amount");
        double  com;
        double comRate= 3;

        com = saleAmount * (comRate/100);

        System.out.println("Commission Amount: " + com);
    }
}
