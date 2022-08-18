package com.assignment_03_intermediate;

import java.util.Scanner;

public class PermComb {
    double fact(double n) {
        int i = 1;
        double fact = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    double permutation(int n, int r) {
        double per;
        per = fact(n) / fact(n - r);
        return per;
    }

    double combination(int n, int r) {
        double com;
        com = fact(n) / (fact(n - r) * fact(r));
        return com;
    }

    public static void main(String[] args) {
        PermComb p = new PermComb();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        System.out.print("Enter value of r: ");
        int r = scan.nextInt();

        if (n >= r) {
            System.out.println("The value of " + n + "P" + r + " is : " + p.permutation(n, r));
            System.out.println("The value of " + n + "C" + r + " is : " + p.combination(n, r));
        } else
            System.out.println("n value should be greater than or equals to r value");
    }
}
