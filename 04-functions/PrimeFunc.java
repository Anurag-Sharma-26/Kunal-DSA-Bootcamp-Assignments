package com.assignment_04;

import java.util.Scanner;

public class PrimeFunc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        System.out.println(isPrime(num));
    }

    static String isPrime(int num) {
        if(num <= 1){
            return (num + " is Prime.");
        }
        int c = 2;
        while (c * c <= num){
            if(num % c == 0){
                return (num + " is not Prime.");
            }
            c++;
        }
        return (num + " is Prime.");
    }
}
