package org.alking.p1000;

public class P1025 {

    private final int SIZE = 1024;

    private boolean[] dp = new boolean[SIZE];

    public boolean divisorGame(int N) {
        dp = new boolean[SIZE];
        dp[2] = true;
        dp[3] = false;
        for (int i = 4; i <= N; i++) {
            int sqrt = (int)Math.sqrt(i);
            for (int j = 1; j <= sqrt; j++) {
                if (i % j == 0 && !dp[i - j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[N];
    }
}
