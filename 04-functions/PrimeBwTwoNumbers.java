package com.assignment_04;

import java.util.Scanner;

public class PrimeBwTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = scan.nextInt();
        System.out.print("Enter the number b: ");
        int b = scan.nextInt();
        listPrime(a, b);
    }

    static void listPrime(int a, int b) {
        int prime;
        for(int i = a; i <= b; i++){
            if(i == 1 || i == 0)
                continue;
            prime = 1;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    prime = 0;
                    break;
                }
            }
            if(prime == 1){
                System.out.print(i + " ");
            }
        }
    }

}
