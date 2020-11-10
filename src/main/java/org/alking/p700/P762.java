package org.alking.p700;

public class P762 {

    private static final boolean[] cache = new boolean[33];

    static {
        cache[2] = true;
        cache[3] = true;
        cache[5] = true;
        cache[7] = true;
        cache[11] = true;
        cache[13] = true;
        cache[17] = true;
        cache[19] = true;
        cache[23] = true;
        cache[29] = true;
    }

    private int bitCount(int v) {
        int acc = 0;
        while (v > 0) {
            acc += v & 1;
            v = v >> 1;
        }
        return acc;
    }

    public int countPrimeSetBits(int L, int R) {
        int res = 0;
        for (int i = L; i <= R; i++) {
            int b = bitCount(i);
            if (cache[b]) {
                res += 1;
            }
        }
        return res;
    }


}
