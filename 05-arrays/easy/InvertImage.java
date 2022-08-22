package com.assignment_05.easy;

import java.util.*;

public class InvertImage {
    static int[][] FlipInvertImage(int[][] image){
        int n = image.length;
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][(n-1)-j] = image[i][j];
                switch (arr[i][(n - 1) - j]) {
                    case 0 -> arr[i][(n - 1) - j] = 1;
                    case 1 -> arr[i][(n - 1) - j] = 0;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int[][] flipped = FlipInvertImage(arr);
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(flipped[i][j]);
            }
            System.out.println();
        }
    }
}
