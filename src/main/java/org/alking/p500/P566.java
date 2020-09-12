package org.alking.p500;

public class P566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int iMax = nums.length;
        int jMax = nums[0].length;
        int total = iMax * jMax;
        if (r * c != total) {
            return nums;
        }

        int[][] result = new int[r][c];
        int m = 0;
        int n = 0;
        for (int i = 0; i < r; i++) {
            result[i] = new int[c];
            for (int j = 0; j < c; j++) {
                result[i][j] = nums[m][n];
                n = n + 1;
                if(n >= jMax){
                    m = m + 1;
                    n = 0;
                }
            }
        }
        return result;
    }
}
