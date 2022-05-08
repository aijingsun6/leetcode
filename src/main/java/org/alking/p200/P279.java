package org.alking.p200;

public class P279 {

    public int numSquares(int n) {

        final int sqrt = (int) Math.sqrt(n);
        final int[] sqrtArray = new int[sqrt];
        for (int i = 0; i < sqrt; i++) {
            sqrtArray[i] = (i + 1) * (i + 1);
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < sqrt; j++) {
                int v = sqrtArray[j];
                if (v > i) {
                    break;
                }
                min = Math.min(min, dp[i - v]);
            }
            dp[i] = min + 1;
        }
        return dp[n];
    }
}
