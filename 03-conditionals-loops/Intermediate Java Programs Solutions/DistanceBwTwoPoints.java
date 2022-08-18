package com.assignment_03_intermediate;

import java.util.Scanner;

public class DistanceBwTwoPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value at which Point A is: ");
        double a = scan.nextDouble();
        System.out.print("Enter the value at which Point B is: ");
        double b = scan.nextDouble();

        if(a > b) System.out.println("Distance between two points is: " + (a-b));
        else System.out.println("Distance between two points is: " + (b-a));
    }
}
