package com.assignment_03_intermediate;

import java.util.Scanner;

public class SumN_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers (Enter 0 to stop): ");
        int num;
        int total = 0;
        while((num = scan.nextInt()) != 0){
            total += num;

        }
        System.out.println("Sum of numbers entered: " + total);
    }
}
