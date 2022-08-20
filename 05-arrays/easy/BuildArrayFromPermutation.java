// LeetCode Problem 1920. Build Array from Permutation


package com.assignment_05.easy;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[6];
        for (int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(newArray(nums)));
    }

    static int[] newArray(int[] arr){
        int[] ans = new int[arr.length];
        for(int i = 0; i < ans.length; i++){
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
