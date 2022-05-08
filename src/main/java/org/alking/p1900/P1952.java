package org.alking.p1900;

/**
 * https://leetcode-cn.com/problems/three-divisors/
 */
public class P1952 {

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isThree(int n) {
        if (n == 1) {
            return true;
        }
        int m = (int) Math.sqrt(n);
        if (m > 1 && m * m == n && isPrime(m)) {
            return true;
        }
        return false;
    }
}
