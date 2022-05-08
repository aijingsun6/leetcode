package org.alking.p1300;

import java.util.Arrays;
import java.util.Comparator;

public class P1337 {

    public int[] kWeakestRows(int[][] mat, int k) {

        int[][] infos = new int[mat.length][];
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            infos[i] = new int[]{sum, i};
        }
        Arrays.sort(infos, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] < o2[0]) {
                    return -1;
                } else if (o1[0] > o2[0]) {
                    return 1;
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = infos[i][1];
        }
        return result;
    }
}
