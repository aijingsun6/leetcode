package org.alking.offer;

public class O14I {

    public int cuttingRope(int n) {

        if (n == 0) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= i/2; j++) {
                int v = Math.max(dp[i-j],i-j);
                max = Math.max(max, j * v);
            }
            dp[i] = max;

        }
        return dp[n];
    }
}
