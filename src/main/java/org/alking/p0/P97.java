package org.alking.p0;

public class P97 {

    public boolean isInterleave(String s1, String s2, String s3) {

        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();
        if (n1 + n2 != n3) {
            return false;
        }

        // dp[m][n] 表示 s1 中 [0,m) 与 s2中[0,n)是否可以凑成 s3中 [0,m+n)
        final boolean[][] dp = new boolean[n1+1][n2+1];
        for (int r = 0; r <= n1; r++) {
            for (int c = 0; c <= n2; c++) {
                if(r == 0 && c == 0){
                    dp[r][c] = false;
                    continue;
                }
                if(r == 0){
                    // c > 0


                }

            }
        }

        return true;
    }

}
