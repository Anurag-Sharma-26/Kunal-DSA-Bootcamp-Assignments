package com.assignment_04;

import java.util.Scanner;

public class FactorialFunc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want the factorial of: ");
        int num = scan.nextInt();
        System.out.println("Factorial of the number is: " + Factorial(num));
    }
    static long Factorial(int num){
        int total = 1;
        int temp = num;
        if(num == 0 || num == 1){
            return 1;
        }
        while(temp > 1){
            total *= temp;
            temp--;
        }
        return total;
    }
}
