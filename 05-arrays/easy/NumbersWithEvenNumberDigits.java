package com.assignment_05.easy;

public class NumbersWithEvenNumberDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            int digits = 0;
            while(nums[i] > 0){
                digits++;
                nums[i] = nums[i]/10;
            }
            if(digits % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
