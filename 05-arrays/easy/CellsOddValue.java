package com.assignment_05.easy;

public class CellsOddValue {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] arr = new int[m][n];
        for(int[] c : indices){
            for(int i=0;i<m;i++) arr[i][c[1]]++;
            for(int j=0;j<n;j++) arr[c[0]][j]++;
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]%2!=0) count++;
            }
        }
        return count;
    }
}
