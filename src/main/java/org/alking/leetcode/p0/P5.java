package org.alking.leetcode.p0;

public class P5 {


    public String longestPalindrome(String s) {

        final int N = s.length();
        int[][] dp = new int[N][N];
        for (int i = 0; i < N; i++) {
            dp[i][i] = 1;
            if ((i + 1) < N) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    dp[i][i + 1] = 2;
                } else {
                    dp[i][i + 1] = -1;
                }
            }
        }
        for (int size = 3; size <= N; size++) {
            for (int i = 0; (i + size) <= N; i++) {
                int last = dp[i + 1][i + size - 2];
                if (last < 0) {
                    dp[i][i + size - 1] = -1;
                    continue;
                }
                if (s.charAt(i) == s.charAt(i + size - 1)) {
                    dp[i][i + size - 1] = last + 2;
                } else {
                    dp[i][i + size - 1] = -1;
                }
            }
        }

        String res = "";
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (dp[i][j] > max) {
                    max = dp[i][j];
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }


}
