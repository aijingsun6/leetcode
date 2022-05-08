package org.alking.p500;

public class P516 {

    public int longestPalindromeSubseq(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        final int N = s.length();
        // dp[i][j] 表示从下标 i 到 下标 j的回文子串的长度
        int[][] dp = new int[N][N];

        // dp[i][i] = 1
        // dp[i[i+1] = 2 ? 1
        int max = 1;
        for (int i = 0; i < N; i++) {
            dp[i][i] = 1;
            if (i < N - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    dp[i][i + 1] = 2;
                    max = 2;
                } else {
                    dp[i][i + 1] = 1;
                }
            }
        }
        for (int size = 2; size < N; size++) {

            for (int start = 0; start < N - size; start++) {

                int end = start + size;
                int v = 0;
                if (s.charAt(start) == s.charAt(end)) {
                    v = dp[start + 1][end - 1] + 2;
                } else {
                    v = Math.max(dp[start + 1][end],dp[start][end-1]);
                }
                dp[start][end] = v;
                max = Math.max(max,v);
            }

        }
        return max;
    }
}
