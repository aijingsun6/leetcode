package org.alking.p700;

public class P746 {

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= cost.length; i++) {

            int v = dp[i - 2] + cost[i - 2];
            int v2 = dp[i - 1] + cost[i - 1];
            dp[i] = Math.min(v, v2);

        }
        return dp[cost.length];
    }


}
