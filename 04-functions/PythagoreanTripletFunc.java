package com.assignment_04;

import java.util.Scanner;

public class PythagoreanTripletFunc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = scan.nextInt();
        System.out.print("Enter the number b: ");
        int b = scan.nextInt();
        System.out.print("Enter the number c: ");
        int c = scan.nextInt();

        System.out.println(PythagoreanTriplet(a, b, c));

    }

    static Boolean PythagoreanTriplet(int a, int b, int c) {
        int x = (a * a), y = (b * b), z = (c *c);
        return x == y + z || y == x + z || z == x + y;
    }
}
