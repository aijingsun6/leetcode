package org.alking.p0;

public class P96 {

    public int numTrees(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int acc = 0;
            for (int j = 1; j <= i; j++) {
                int left = dp[j - 1];
                int right = dp[i - j];
                acc += left * right;
            }
            dp[i] = acc;

        }
        return dp[n];
    }


}
