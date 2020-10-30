package org.alking.p400;

public class P463 {

    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length < 1) {
            return 0;
        }
        int acc = 0;
        int iMax = grid.length;
        int jMax = grid[0].length;
        for (int i = 0; i < iMax; i++) {
            for (int j = 0; j < jMax; j++) {

                if (grid[i][j] > 0) {
                    // land
                    // calc up
                    if (i == 0 || grid[i - 1][j] == 0) {
                        acc += 1;
                    }
                    // calc left
                    if (j == 0 || grid[i][j - 1] == 0) {
                        acc += 1;
                    }
                    // calc down
                    if ((i == iMax - 1) || grid[i + 1][j] == 0) {
                        acc += 1;
                    }
                    // calc right
                    if ((j == jMax - 1) || grid[i][j + 1] == 0) {
                        acc += 1;
                    }
                }
            }
        }
        return acc;
    }
}
