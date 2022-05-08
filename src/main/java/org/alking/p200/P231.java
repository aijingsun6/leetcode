package org.alking.p200;

public class P231 {

    public boolean isPowerOfTwo(int n) {

        if (n < 1) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        long p = n;
        p |= (p >>> 1);
        p |= (p >>> 2);
        p |= (p >>> 4);
        p |= (p >>> 8);
        p |= (p >>> 16);
        p += 1;

        return n == (p >> 1);
    }
}
