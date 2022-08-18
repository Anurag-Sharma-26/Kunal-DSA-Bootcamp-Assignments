package com.assignment_03_intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want the factorial of: ");
        int num = scan.nextInt();
        int total = 1;

        if(num == 0 || num == 1){
            System.out.println(num + "! is: " + 1);
        }
        else{
            int temp = num;
            while(temp> 1){
                total *= temp;
                temp--;
            }
            System.out.println(num + "! is: " + total);
        }


    }
}
