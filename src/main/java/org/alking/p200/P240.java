package org.alking.p200;

public class P240 {

    public boolean searchMatrix(int[][] matrix, int target) {

        int rowMax = matrix.length - 1;
        int colMax = matrix[0].length - 1;
        int row = rowMax;
        int col = 0;
        while (row >= 0 && col <= colMax) {
            int v = matrix[row][col];
            if (v < target) {
                col++;
            } else if (v > target) {
                row--;
            } else {
                return true;
            }

        }
        return false;
    }
}
