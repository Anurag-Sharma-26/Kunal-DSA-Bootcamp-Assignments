package com.assignment_05.easy;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersSmallCurrentNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(smallerNumbers(arr)));
    }
    static int[] smallerNumbers(int[] nums){
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            int count = 0;
            for(int j = 0; j < n ; j++){
                if(i != j && nums[i] > nums[j]){
                    count++;
                    arr[i] = count;
                }
            }
        }
        return arr;
    }
}
