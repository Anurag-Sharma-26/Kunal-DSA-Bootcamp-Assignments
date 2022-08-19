package com.assignment_04;

import java.util.Scanner;

public class MinMaxFunc {

    static int Max(int a, int b, int c){
        int max = Math.max(a, b);
        max = Math.max(max, c);
        return max;
    }
    static int Min(int a, int b, int c){
        int min = Math.min(a, b);
        min = Math.min(min, c);
        return min;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = scan.nextInt();
        System.out.print("Enter the number b: ");
        int b = scan.nextInt();
        System.out.print("Enter the number c: ");
        int c = scan.nextInt();

        System.out.println("Maximum number is: " + Max(a, b, c));
        System.out.println("Minimum number is: " + Min(a, b, c));


    }
}
