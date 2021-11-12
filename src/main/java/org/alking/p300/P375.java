package org.alking.p300;

public class P375 {

    public int getMoneyAmount(int n) {

        if (n <= 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }
        // dp[i][j] 表示从 i 到 j 的值，
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i][i] = 0;
        }
        for (int span = 1; span < n; span++) {

            int start = 1;
            int end = start + span;
            while (end <= n) {
                int min = Integer.MAX_VALUE;
                for (int j = start; j <= end; j++) {
                    int left = j == start ? 0: dp[start][j-1];
                    int right = j == end ? 0: dp[j+1][end];
                    int v = Math.max(left,right) + j;
                    min = Math.min(min, v);
                }
                dp[start][end] = min;
                start++;
                end = start + span;
            }
        }
        return dp[1][n];
    }
}
