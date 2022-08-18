package com.assignment_03_intermediate;

import java.util.Scanner;

public class DiscountProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Price of the Product: ");
        double markedPrice = scan.nextDouble();
        System.out.println("Discount rate is 15%");

        double  discount,amount;
        discount= 15;

        amount= markedPrice - (markedPrice * (discount/100));

        System.out.println("Amount after Discount: " + amount);

    }
}
