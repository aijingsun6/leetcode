package org.alking.lcp;

/**
 * https://leetcode-cn.com/problems/deep-dark-fraction/
 */
public class LCP02 {
    public int[] fraction(int[] cont) {

        final int n = cont.length;
        if(n ==1){
            return new int[]{cont[0],1};
        }
        int[][] dp = new int[n][2];

        dp[n - 2] = new int[]{cont[n - 2] * cont[n - 1] + 1, cont[n - 1]};
        for(int i = n-3;i >=0; i--){
            dp[i] = new int[]{ dp[i+1][0] * cont[i] + dp[i+1][1],dp[i+1][0]};
        }
        return dp[0];

    }

}
