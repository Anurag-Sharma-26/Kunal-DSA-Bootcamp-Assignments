package com.assignment_04;

import java.util.Scanner;

public class VoteAgeFunc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.println(VoteAge(age));
    }

    static String VoteAge(int age) {
        if(age >= 18){
            return "You are eligible to vote";
        }
        return "You are not eligible to vote";
    }
}
