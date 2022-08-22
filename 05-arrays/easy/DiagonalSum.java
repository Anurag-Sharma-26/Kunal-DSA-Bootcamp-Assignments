package com.assignment_05.easy;

public class DiagonalSum {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += mat[i][i] + mat[i][n-1-i];
        }
        if(n%2 == 0) return sum;
        return sum -= mat[n/2][n/2];
    }
}
