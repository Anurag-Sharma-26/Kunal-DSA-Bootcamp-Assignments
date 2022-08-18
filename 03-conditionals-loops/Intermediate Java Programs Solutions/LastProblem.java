package com.assignment_03_intermediate;

import java.util.Scanner;

public class LastProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num;
        int sNegative = 0;
        int sumOdd = 0;
        int sumEven = 0;
        while((num = scan.nextInt()) != 0){
            if (num < 0){
                sNegative += num;
            }
            else if(num > 0 && num % 2 ==0){
                sumEven += num;
            }
            else if(num > 0 && num % 2 != 0){
                sumOdd += num;
            }
        }
        System.out.println("Sum of negative numbers entered: " + sNegative);
        System.out.println("Sum of positive odd numbers entered: " + sumOdd);
        System.out.println("Sum of positive even numbers entered: " + sumEven);
    }
}
