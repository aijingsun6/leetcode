package org.alking.p0;

public class P63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        final int ROW = obstacleGrid.length;
        final int COL = obstacleGrid[0].length;
        final int[][] dp = new int[ROW][COL];

        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {

                if (r == 0 && c == 0) {
                    dp[r][c] =  obstacleGrid[r][c] == 0 ? 1:0;
                    continue;
                }
                if (r == 0 && obstacleGrid[r][c] == 0) {
                    dp[r][c] = dp[r][c - 1];
                    continue;
                } else if (r == 0) {
                    dp[r][c] = 0;
                    continue;
                }

                if (c == 0 && obstacleGrid[r][c] == 0) {
                    dp[r][c] = dp[r - 1][c];
                    continue;
                } else if (c == 0) {
                    dp[r][c] = 0;
                    continue;
                }
                if (obstacleGrid[r][c] == 0) {
                    dp[r][c] = dp[r - 1][c] + dp[r][c - 1];
                } else {
                    dp[r][c] = 0;
                }
            }
        }
        return dp[ROW - 1][COL - 1];
    }
}
