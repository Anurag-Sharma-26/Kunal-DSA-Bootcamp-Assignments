package com.assignment_04;

import java.util.Scanner;

public class CircleAreaPerimeterFunc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        double r = scan.nextDouble();

        AreaPerimeter(r);
    }

    static void AreaPerimeter(double r){

        double area = Math.PI * (r * r);
        double c = 2 * Math.PI * r;

        System.out.println("Area of the Circle is: " + area + "\nCircumference of the circle is: " + c);
    }
}
