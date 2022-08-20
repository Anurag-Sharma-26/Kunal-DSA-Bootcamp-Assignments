package com.assignment_05.easy;

import java.util.Arrays;
import java.util.Scanner;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        System.out.print("Enter first array(numbers): ");
        for (int i = 0; i < 5; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.print("Enter second array(indexes): ");
        for (int j = 0; j < 5; j++) {
            arr2[j] = scan.nextInt();
        }
        System.out.println(Arrays.toString(createTargetArray(arr1, arr2)));
    }
    static int[] createTargetArray(int[] nums, int[] index){
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int j = n - 1;
            while(j > index[i]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[index[i]] = nums[i];
        }
        return arr;
    }
}
