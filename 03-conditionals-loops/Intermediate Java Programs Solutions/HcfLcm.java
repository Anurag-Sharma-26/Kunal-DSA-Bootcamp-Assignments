package com.assignment_03_intermediate;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int small = Math.min(a, b);
        int hcf = 0;

        for(int i=1; i<=small+1; i++){
            if (a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        int lcm = (a*b)/hcf;
        System.out.println("HCF is: " + hcf + ", LCM is: " + lcm);
    }
}


