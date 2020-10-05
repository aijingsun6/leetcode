package org.alking.p1700;

public class P1720 {


    /**
     * 0,0 -> 2,2
     * 0,1 -> 1,2
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {

        int iMax = matrix.length;
        int jMax = matrix[0].length;

        for (int i = 0; i < iMax; i++) {
            for (int j = 0; j < jMax-i; j++) {
                int ii = iMax - j - 1;
                int jj = jMax - i - 1;
                int t = matrix[i][j];
                matrix[i][j] = matrix[ii][jj];
                matrix[ii][jj] = t;
            }
        }
        for (int i = 0; i < iMax/2; i++) {
            int ii = iMax - i - 1;
            int[] t = matrix[i];
            matrix[i] = matrix[ii];
            matrix[ii] = t;
        }

    }
}
