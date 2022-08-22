package com.assignment_05.easy;

import java.util.Scanner;

public class HighestAltitude {
    static int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n+1];
        arr[0] = 0;
        int max = arr[0];
        for(int i = 0; i < n; i++){
            arr[i + 1] = gain[i] + arr[i];
            if (arr[i + 1] > max) max = arr[i + 1];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(largestAltitude(arr));
    }
}
