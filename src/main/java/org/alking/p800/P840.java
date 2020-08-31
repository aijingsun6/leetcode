package org.alking.p800;

public class P840 {


    public int numMagicSquaresInside(int[][] grid) {
        int iMax = grid.length;
        int jMax = grid[0].length;
        int acc = 0;
        for (int i = 0; i < iMax - 2; i++) {
            for (int j = 0; j < jMax - 2; j++) {
                if (checkMagicSquares(grid, i, j)) {
                    acc += 1;
                }
            }
        }
        return acc;
    }

    private boolean checkMagicSquares(int[][] grid, int x, int y) {

        boolean[] visit = new boolean[10];
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                int v = grid[i][j];
                if (v > 9) {
                    return false;
                }
                if (visit[v]) {
                    return false;
                }
                visit[v] = true;
            }
        }


        int target = 15;
        for (int m = x; m < x + 3; m++) {
            int sum = 0;
            for (int n = y; n < y + 3; n++) {
                sum += grid[m][n];
            }
            if (sum != target) {
                return false;
            }
        }


        for (int m = y; m < y + 3; m++) {
            int sum = 0;
            for (int n = x; n < x + 3; n++) {
                sum += grid[n][m];
            }
            if (sum != target) {
                return false;
            }
        }

        if (grid[x][y] + grid[x + 1][y + 1] + grid[x + 2][y + 2] != target) {
            return false;
        }

        if (grid[x][y + 2] + grid[x + 1][y + 1] + grid[x + 2][y] != target) {
            return false;
        }
        return true;
    }
}
