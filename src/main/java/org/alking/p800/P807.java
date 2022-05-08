package org.alking.p800;

public class P807 {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if (grid == null || grid.length < 1) {
            return 0;
        }
        final int ROW = grid.length;
        final int COL = grid[0].length;
        int[] rowMax = new int[ROW];
        int[] colMax = new int[COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                int v = grid[i][j];
                rowMax[i] = Math.max(rowMax[i], v);
                colMax[j] = Math.max(colMax[j], v);
            }
        }
        int acc = 0;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                acc += Math.min(rowMax[i], colMax[j]) - grid[i][j];

            }
        }
        return acc;
    }
}
