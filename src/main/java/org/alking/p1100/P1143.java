package org.alking.p1100;

public class P1143 {


    /**
     *
     */
    public int longestCommonSubsequence(String text1, String text2) {

        if (text1 == null || text1.length() < 1) {
            return 0;
        }

        if (text2 == null || text2.length() < 1) {
            return 0;
        }
        int n1 = text1.length();
        int n2 = text2.length();

        // col = n1,row = n2
        // dp[i][j]表示 text1[i] 与 text2[j]的最大公共子串长度
        int[][] dp = new int[n1][];
        for (int i = 0; i < n1; i++) {
            dp[i] = new int[n2];
            int c1 = text1.charAt(i);
            for (int j = 0; j < n2; j++) {
                int c2 = text2.charAt(j);
                if( c2 == c1){
                    if(i > 0 && j > 0){
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }else {
                        dp[i][j] = 1;
                    }
                }else {
                    int m1 = i > 0 ? dp[i-1][j] : 0;
                    int m2 = j > 0 ? dp[i][j-1] : 0;
                    dp[i][j] = Math.max(m1,m2);
                }

            }
        }
        return dp[n1-1][n2-1];
    }
}
