// LeetCode Problem 1480. Running Sum of 1d Array

package com.assignment_05.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Sum1DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums){
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
