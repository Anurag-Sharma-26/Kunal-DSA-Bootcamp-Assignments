package com.assignment_03_intermediate;

import java.util.Scanner;

public class SumDigitsNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scan.nextInt();
        int temp;
        int sum = 0;
        while(num > 0){
            temp = num % 10;
            sum += temp;
            num = num / 10;
        }
        System.out.println("Sum of Digits of the number entered is: " + sum);
    }
}
