package org.alking.p100;

public class P115 {

    public int numDistinct(String s, String t) {

        if (s == null || s.length() < 1) {
            return 0;
        }
        if (t == null || t.length() < 1) {
            return 0;
        }

        // sl
        int sl = s.length();
        int tl = t.length();
        int[][] dp = new int[tl][sl];
        for (int i = 0; i < tl; i++) {
            dp[i] = new int[sl];
            int acc = 0;
            for (int j = i; j < sl; j++) {
                if (s.charAt(j) == t.charAt(i)) {
                    if (i > 0) {
                        acc += dp[i - 1][j - 1];
                    } else {
                        acc += 1;
                    }

                }
                dp[i][j] = acc;
            }

        }
        return dp[tl - 1][sl - 1];
    }

}
