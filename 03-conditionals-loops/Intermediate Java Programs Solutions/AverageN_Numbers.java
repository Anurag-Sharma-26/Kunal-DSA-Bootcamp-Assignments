package com.assignment_03_intermediate;

import java.util.Scanner;

public class AverageN_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers (Enter 0 to stop): ");
        int num;
        int count = 0;
        int total = 0;
        while((num = scan.nextInt()) != 0){
            total += num;
            count++;
        }
        int average = total/count;
        System.out.println("Average of numbers entered: " + average);
    }
}
