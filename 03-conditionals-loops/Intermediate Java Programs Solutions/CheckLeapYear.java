package com.assignment_03_intermediate;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        boolean leap;
        if(year % 4 == 0){
            if(year % 100 == 0){
                leap = year % 400 == 0;
            }
            else leap = true;
        }
        else leap = false;

        if(leap) System.out.println(year + " is Leap Year.");
        else System.out.println(year + " is not a Leap Year.");
    }
}
