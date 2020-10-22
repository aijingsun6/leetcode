package org.alking.p0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P54 {

    private static final int DIRECTION_UP = 1;
    private static final int DIRECTION_DOWN = 2;
    private static final int DIRECTION_LEFT = 3;
    private static final int DIRECTION_RIGHT = 4;

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return Collections.emptyList();
        }
        int iMax = matrix.length;
        int jMax = matrix[0].length;
        boolean[][] visit = new boolean[iMax][jMax];


        int direction = DIRECTION_RIGHT;
        int i = 0;
        int j = 0;
        int i2;
        int j2;
        List<Integer> acc = new ArrayList<>(iMax * jMax);
        while (true) {
            acc.add(matrix[i][j]);
            visit[i][j] = true;
            boolean next = true;
            switch (direction) {
                case DIRECTION_RIGHT:
                    j2 = j + 1;
                    i2 = i + 1;
                    if (j2 < jMax && !visit[i][j2]) {
                        j = j2;
                    } else if (i2 < iMax && !visit[i2][j]) {
                        i = i2;
                        direction = DIRECTION_DOWN;
                    } else {
                        next = false;
                    }
                    break;
                case DIRECTION_DOWN:
                    i2 = i + 1;
                    j2 = j - 1;
                    if (i2 < iMax && !visit[i2][j]) {
                        i = i2;
                    } else if (j2 >= 0 && !visit[i][j2]) {
                        j = j2;
                        direction = DIRECTION_LEFT;
                    } else {
                        next = false;
                    }
                    break;
                case DIRECTION_LEFT:
                    j2 = j - 1;
                    i2 = i - 1;
                    if (j2 >= 0 && !visit[i][j2]) {
                        j = j2;
                    } else if (i2 >= 0 && !visit[i2][j]) {
                        i = i2;
                        direction = DIRECTION_UP;
                    } else {
                        next = false;
                    }
                    break;
                case DIRECTION_UP:

                    i2 = i - 1;
                    j2 = j + 1;
                    if (i2 >= 0 && !visit[i2][j]) {
                        i = i2;
                    } else if (j2 < jMax && !visit[i][j2]) {
                        j = j2;
                        direction = DIRECTION_RIGHT;
                    } else {
                        next = false;
                    }
                    break;
                default:
                    break;
            }
            if (!next) {
                break;
            }
        }
        return acc;
    }
}
