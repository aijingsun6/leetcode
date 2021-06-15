package org.alking.p0;

public class P64 {

    public int minPathSum(int[][] grid) {

        final int ROW = grid.length;
        final int COL = grid[0].length;
        final int[][] dp = new int[ROW][COL];
        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {

                if (r == 0 && c == 0) {
                    dp[r][c] = grid[r][c];
                    continue;
                }
                if (r == 0) {
                    dp[r][c] = dp[r][c - 1] + grid[r][c];
                    continue;
                }
                if (c == 0) {
                    dp[r][c] = dp[r - 1][c] + grid[r][c];
                    continue;
                }
                dp[r][c] = Math.min(dp[r - 1][c], dp[r][c - 1]) + grid[r][c];
            }
        }
        return dp[ROW - 1][COL - 1];

    }
}
