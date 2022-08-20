package com.assignment_05.easy;

import java.util.*;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int row=0; row < 3; row++){
            for (int col=0; col < 3; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for(int row = 0; row < 3; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
