package com.assignment_03_intermediate;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your marks (Enter 0 to stop): ");
        int marks;
        int count = 0;
        int total = 0;
        while((marks = scan.nextInt()) != 0){
            total += marks;
            count++;
        }
        int average = total/count;
        System.out.println("Average marks: " + average);
    }
}
