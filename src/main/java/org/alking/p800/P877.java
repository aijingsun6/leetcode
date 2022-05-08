package org.alking.p800;

public class P877 {

    public boolean stoneGame(int[] piles) {

        int N = piles.length;

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += piles[i];
        }
        // dp[m][n] 表示 m - n 中拿到最多数量 m < n ,n -m + 1 为偶数
        final int[][] dp = new int[N][N];
        for (int gap = 2; gap <= N; gap += 2) {

            int from = 0;
            int to = from + gap - 1;
            while (to < N) {
                if (gap == 2) {
                    dp[from][to] = Math.max(piles[from], piles[from + 1]);
                } else {
                    int takeFrom = piles[from] + Math.min(dp[from + 1][to - 1], dp[from + 2][to]);
                    int takeTo = piles[to] + Math.min(dp[from][to - 2], dp[from + 1][to - 1]);
                    dp[from][to] = Math.max(takeFrom, takeTo);
                }
                from = from + 1;
                to = to + 1;
            }
        }
        int max = dp[0][N - 1];
        return max * 2 > sum;

    }
}
