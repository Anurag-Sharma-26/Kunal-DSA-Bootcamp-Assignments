package com.assignment_03_intermediate;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of innings: ");
        int innings = scan.nextInt();
        System.out.print("Enter total runs scored: ");
        long totalRuns= scan.nextLong();
        System.out.print("Enter number of times not out in innings: ");
        int notOut= scan.nextInt();

        double avg = totalRuns / (innings - notOut);

        System.out.println("Batting average: " + avg);
    }
}
