package com.assignment_04;

import java.util.Scanner;

public class ProductFunc {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the numbers a and b: ");
    int a = scan.nextInt();
    int b = scan.nextInt();

    System.out.println("The sum is: " + product(a, b));
}

    static int product(int a, int b) {
        return a * b;
    }
}
