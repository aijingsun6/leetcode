package org.alking.p1900;

/**
 * https://leetcode-cn.com/problems/count-square-sum-triples/
 */
public class P1925 {

    private boolean isPow2(int n) {
        int p = (int) Math.sqrt(n);
        return p * p == n;
    }

    public int countTriples(int n) {

        // a < b < c
        // 2*a^2 < a^2 + b^2 < c^2 < n^2
        // a < n / 2^0.5
        int acc = 0;
        for (int a = 2; a <= (int) (n / Math.sqrt(2)); a++) {
            int b = a + 1;
            while (true) {
                int sum = a * a + b * b;
                if (sum > n * n) {
                    break;
                }
                if (isPow2(sum)) {
                    acc += 1;
                }
                b += 1;
            }
        }
        return acc * 2;
    }
}
