package org.alking.p600;

public class P650 {

    public int minSteps(int n) {
        if (n == 1) {
            return 0;
        }

        int[] dp = new int[n + 1];
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            int m = (int) Math.sqrt(i);
            int min = dp[1]+i;
            for (int j = 2; j <= m; j++) {

                if(i % j == 0){
                    int b = i / j;
                    min = Math.min(dp[j]+b,min);
                    min = Math.min(dp[b]+j,min);
                }
            }
            dp[i]=min;

        }
        return dp[n];
    }
}
