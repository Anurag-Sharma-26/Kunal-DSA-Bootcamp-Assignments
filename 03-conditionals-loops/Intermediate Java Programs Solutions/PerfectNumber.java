package com.assignment_03_intermediate;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int sum = 0;

        for(int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += num;
            }
        }
        if(sum == num){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a Perfect Number");
        }
    }
}
