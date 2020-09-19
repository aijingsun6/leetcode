package org.alking.p1300;

import java.util.ArrayList;
import java.util.List;

public class P1380 {

    public List<Integer> luckyNumbers(int[][] matrix) {


        int iMax = matrix.length;
        int jMax = matrix[0].length;
        List<Integer> result = new ArrayList<>(iMax);
        for (int i = 0; i < iMax; i++) {

            // find min
            int min = matrix[i][0];
            int jj = 0;
            for (int j = 1; j < jMax; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    jj = j;
                }
            }

            // check max
            boolean max = true;
            for (int idx = 0; idx < iMax; idx++) {
                if (matrix[idx][jj] > min) {
                    max = false;
                    break;
                }

            }
            if (max) {
                result.add(min);
            }


        }

        return result;
    }
}
