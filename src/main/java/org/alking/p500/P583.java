package org.alking.p500;

public class P583 {

    /**
     * 最大前序子序列
     */
    public int minDistance(String word1, String word2) {
        final int N1 = word1.length();
        final int N2 = word2.length();
        int[][] dp = new int[N1][N2];
        for (int i = 0; i < N1; i++) {
            for (int j = 0; j < N2; j++) {
                if (word1.charAt(i) == word2.charAt(j)){
                    int last = 0;
                    if (i > 0 && j > 0) {
                        last = dp[i - 1][j - 1];
                    }
                    dp[i][j] = last + 1;

                }else{
                    int max = 0;
                    if(i > 0){
                        max = Math.max(max,dp[i-1][j]);
                    }
                    if(j > 0){
                        max = Math.max(max,dp[i][j-1]);
                    }
                    dp[i][j] = max;
                }
            }
        }
        int pre = dp[N1 - 1][N2 - 1];
        return word1.length() - pre + word2.length() - pre;
    }
}
