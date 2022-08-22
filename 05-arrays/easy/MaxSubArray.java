package com.assignment_05.easy;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : nums){
            sum += i;
            max = Math.max(sum, max);

            if(sum<0) sum=0;
        }
        return max;
    }
}
