package org.alking.p1100;

public class P1175 {

    private static final int MOD = 1_000_000_000 + 7;

    private boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n == 3) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public int numPrimeArrangements(int n) {

        int primeCnt = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                primeCnt++;
            }
        }

        int m = n - primeCnt;
        int max = Math.max(m, primeCnt);
        long[] dp = new long[max + 1];
        // factor
        dp[0] = 1;

        for (int i = 1; i <= max; i++) {
            dp[i] = (dp[i - 1] * i) % MOD;
        }
        return (int)((dp[m] * dp[primeCnt]) % MOD);
    }
}
