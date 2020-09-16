package org.alking.p500;

import java.util.ArrayDeque;

public class P542 {

    public int[][] updateMatrix(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return null;
        }

        int iMax = matrix.length;
        int jMax = matrix[0].length;
        int[][] acc = new int[iMax][jMax];
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < iMax; i++) {
            acc[i] = new int[jMax];
            for (int j = 0; j < jMax; j++) {
                if (matrix[i][j] == 0) {
                    // fill 0
                    acc[i][j] = 0;
                } else {
                    acc[i][j] = -1;
                    queue.addLast(new int[]{i, j});
                }
            }
        }

        int start = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            for(int idx = 0; idx < n; idx ++){
                int[] e = queue.removeFirst();
                int i = e[0];
                int j = e[1];

                if (i > 0 && acc[i - 1][j] == start) {
                   acc[i][j]=start+1;
                   continue;
                }
                if (j > 0 && acc[i][j - 1] == start) {
                    acc[i][j]=start+1;
                    continue;
                }
                if (i + 1 < iMax && acc[i + 1][j] == start) {
                    acc[i][j]=start+1;
                    continue;
                }
                if (j + 1 < jMax && acc[i][j + 1] == start) {
                    acc[i][j]=start+1;
                    continue;
                }
                queue.addLast(e);
            }
            start += 1;

        }
        return acc;
    }

}
