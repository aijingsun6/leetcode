package org.alking.p1200;

public class P1269 {

    public long numWays(int steps, int arrLen) {

        // dp[n][m] 第 n 走到 位置的 m 数量
        // dp[1][0] = 1 表示 第1步，走到位置0 的数量 = 1
        // dp[1][1] = 1 表示 第1步，走到位置1 的数量 = 1
        // dp[n][m] = dp[n-1][m] + dp[n-1][m-1] + dp[n-1][m+1] (理想条件下)
        int row = 1 + steps;
        int col = 1 + arrLen;
        long[][] dp = new long[row][col];
        for (int i = 0; i < row; i++) {
            dp[i] = new long[col];
        }
        dp[1][0] = 1;
        dp[1][1] = 1;
        for (int step = 2; step <= steps; step++) {
            dp[step][0] = dp[step-1][0] + dp[step-1][1];
            int maxIdx = arrLen - 1;
            int max = Math.min(step, maxIdx);
            for (int j = 1; j <= max; j++) {
                if (j == step){
                    // 最大能走的地方
                    dp[step][j] = 1;
                }else if(j == maxIdx){
                    // 走到数组边界了
                    dp[step][j] = dp[step - 1][j - 1] + dp[step - 1][j];
                }else{
                    // 常规
                    dp[step][j] = dp[step - 1][j - 1] + dp[step - 1][j] + dp[step - 1][j + 1];
                }
            }
        }
        return dp[steps][0];
    }

    public int numWays2(int steps, int arrLen){
        int mod = 1000000007;
        int col = Math.min(1 + arrLen,steps+1);
        long[] dp = new long[col];
        dp[0] = 1;
        dp[1] = 1;
        for (int step = 2; step <= steps; step++) {
            long[] dpNext = new long[col];
            dpNext[0] = (dp[0] + dp[1]) % mod;
            for (int j = 1; j < col; j++) {
                if (j == step){
                    // 最大能走的地方
                    dpNext[j] = 1;
                }else if(j == col-1){
                    // 走到数组边界了
                    dpNext[j] = (dp[j - 1] + dp[j]) % mod;
                }else{
                    // 常规
                    dpNext[j] = (dp[j - 1] + dp[j] + dp[j + 1])% mod;
                }
            }
            dp = dpNext;
        }
        return (int)dp[0];
    }


}
