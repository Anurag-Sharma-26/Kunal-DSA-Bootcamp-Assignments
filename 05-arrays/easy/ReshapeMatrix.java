package com.assignment_05.easy;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if (row * col != r * c) return mat;

        int[][] arr = new int[r][c];

        int arr_rows = 0;
        int arr_cols = 0;

        for (int[] ints : mat) {
            for (int j = 0; j < col; j++) {
                arr[arr_rows][arr_cols] = ints[j];
                arr_cols++;

                if (arr_cols == c) {
                    arr_cols = 0;
                    arr_rows++;
                }
            }
        }
        return arr;
    }
}
