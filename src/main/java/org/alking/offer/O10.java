package org.alking.offer;

public class O10 {

    public int fib(int n) {
        if(n < 1){
            return 0;
        }
        if(n < 2){
            return 1;
        }
        long[] dp = new long[n +1];
        dp[0] = 0;
        dp[1] = 1;
        final int MOD = 1000000007;
        for(int i = 2; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }

        return (int)dp[n];
    }
}
