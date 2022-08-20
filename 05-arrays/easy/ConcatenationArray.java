// LeetCode Problem 1929. Concatenation of Array

package com.assignment_05.easy;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(Concat(nums)));
    }

    static int[] Concat(int[] arr){
        int[] ans = new int[2 * arr.length];
        for(int i = 0; i < arr.length; i++){
            ans[i] = arr[i];
            ans[i + arr.length] = arr[i];
        }
        return ans;
    }
}
