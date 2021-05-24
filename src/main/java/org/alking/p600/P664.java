package org.alking.p600;

public class P664 {

    public int strangePrinter(String s) {

        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] t = new int[n];
            t[i] = 1;
            dp[i] = t;
        }

        // dp[0][0] = 1

        // dp[0][1] = .....
        // dp[1][1] = 1

        // dp[0][2] = ...
        // dp[1][2] = ...
        // dp[2][2] = 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    dp[j][i] = dp[j][i - 1];
                    continue;
                }

                int min = Integer.MAX_VALUE;

                for (int k = j; k < i; k++) {
                    if (s.charAt(i) == s.charAt(k)) {
                        int v = dp[j][k - 1] + dp[k][i - 1];
                        min = Math.min(v, min);
                    }
                }
                dp[j][i] = Math.min(dp[j][i - 1] + 1,min);
            }
        }
        return dp[0][n - 1];
    }
}
