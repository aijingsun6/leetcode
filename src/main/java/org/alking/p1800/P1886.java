package org.alking.p1800;

public class P1886 {

    private int[][] rotation(int n, int[][] mat) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            result[i] = new int[n];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][n - 1 - i] = mat[i][j];
            }
        }
        return result;
    }

    private boolean eq(int n, int[][] mat1, int[][] mat2) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        final int n = mat.length;
        if (eq(n, mat, target)) {
            return true;
        }
        for (int i = 0; i < 3; i++) {
            mat = rotation(n,mat);
            if (eq(n, mat, target)) {
                return true;
            }
        }
        return false;
    }
}
