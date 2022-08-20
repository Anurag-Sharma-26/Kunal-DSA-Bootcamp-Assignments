package com.assignment_05.easy;

import java.util.*;

public class KidWithHighestCandies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter extra candies: ");
        int extraCandies = scan.nextInt();
        int[] candies = new int[3];
        for (int i = 0; i < 3; i++) {
            candies[i] = scan.nextInt();
        }
        System.out.println(maxCandies(candies, extraCandies));
    }
    static ArrayList<Boolean> maxCandies(int[] arr, int n) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        for (int i : arr) {
            if ((i + n) >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
