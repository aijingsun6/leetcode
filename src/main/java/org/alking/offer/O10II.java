package org.alking.offer;

public class O10II {

    public int numWays(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        final int MOD = 1000000007;
        long a = 1;
        long b = 2;
        long c = 0;
        for(int i = 3; i <=n;i++){
            c = (a + b) % MOD;
            a = b;
            b = c;
        }
        return (int)c;
    }
}
