package com.assignment_05.easy;

import java.util.Scanner;

public class NumberGoodPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(GoodPairs(arr));
    }
    static int GoodPairs(int[] nums){
        int count = 0;
        for(int i =0 ; i < nums.length ;i++){
            for(int j = i+1; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
