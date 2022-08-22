package com.assignment_05.easy;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = nums.length > 0 ? 1 : 0;
        for(int i : nums){
            if(i > nums[k-1]) nums[k++] = i;
        }
        return k;
    }
}
