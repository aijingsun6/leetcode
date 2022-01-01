package org.alking.p2000;

public class P2022 {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original == null || original.length < 1) {
            return new int[][]{};
        }
        final int N = original.length;
        if (N != m * n) {
            return new int[][]{};
        }

        int[][] result = new int[m][n];
        int start = 0;
        for (int i = 0; i < m; i++) {
            System.arraycopy(original, start, result[i], 0, n);
            start += n;
        }
        return result;
    }
}
