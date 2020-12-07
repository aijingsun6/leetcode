package org.alking.p800;

public class P861 {

    public int matrixScore(int[][] mat) {
        int iMax = mat.length;
        int jMax = mat[0].length;
        int[] colZeroSum = new int[jMax];
        for (int i = 0; i < iMax; i++) {
            int[] arr = mat[i];
            boolean conv = arr[0] == 0;
            for (int j = 0; j < jMax; j++) {
                if (conv) {
                    arr[j] = 1 - arr[j];
                }
                if (arr[j] < 1) {
                    colZeroSum[j] += 1;
                }
            }
        }
        for (int j = 0; j < jMax; j++) {
            if (colZeroSum[j] > (iMax / 2)) {
                // convert
                for (int i = 0; i < iMax; i++) {
                    mat[i][j] = 1 - mat[i][j];
                }
            }
        }
        int acc = 0;
        for (int i = 0; i < iMax; i++) {

            int[] arr = mat[i];
            int add = 0;
            for (int j = 0; j < jMax; j++) {
                add = (add << 1) + arr[j];
            }
            acc += add;
        }
        return acc;
    }


}
