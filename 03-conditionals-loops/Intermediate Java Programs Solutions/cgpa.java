package com.assignment_03_intermediate;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your marks out of 100 (0 to stop): ");
        int marks;
        int count = 0;
        double total = 0;
        while((marks = scan.nextInt()) != 0){
            if(marks > 100) System.out.println("Enter valid marks.");
            else {
                total += marks;
                count++;
            }
        }
        double percentage = total/count;
        System.out.println("Percentage is: " + percentage + "%");
        double cgpa = percentage / 9.5;
        if(cgpa > 10) System.out.println("CGPA is: 10");
        else System.out.println("CGPA is: " + cgpa);
    }
}
