package com.assignment_05.easy;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter even array length: ");
        int k = scan.nextInt();
        int n = k/2;
        int[] nums = new int[k];
        System.out.println();
        for (int i = 0; i < k; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            arr[k] = nums[i];
            arr[++k] = nums[n + i];
            k++;
        }
        return arr;
    }

}
