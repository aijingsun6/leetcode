package org.alking.p700;

public class P766 {

    public boolean isToeplitzMatrix(int[][] matrix) {

        int iMax = matrix.length;
        int jMax = matrix[0].length;

        for (int i = 1; i < iMax; i++) {

            for (int j = 1; j < jMax; j++) {

                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }

            }
        }
        return true;
    }
}
