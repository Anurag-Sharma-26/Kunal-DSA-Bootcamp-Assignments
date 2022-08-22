package com.assignment_05.easy;

import java.util.*;

public class LuckyNumber {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for(int row=0; row< matrix.length; row++){
            int minCol=minColInRow(matrix, row);
            int value=matrix[row][minCol];
            if(checkIfMaxInCol(matrix, minCol, value)) result.add(value);
        }
        return result;
    }
    public int minColInRow(int[][] matrix, int row){
        int minIndex=0, min=matrix[row][minIndex];
        for(int col=1; col<matrix[row].length; col++){
            if(matrix[row][col]<min) {
                min = matrix[row][col];
                minIndex = col;
            }
        }
        return minIndex;
    }
    public boolean checkIfMaxInCol(int[][] matrix, int minCol, int value){
        for (int[] ints : matrix) {
            if (ints[minCol] > value) return false;
        }
        return true;
    }
}
