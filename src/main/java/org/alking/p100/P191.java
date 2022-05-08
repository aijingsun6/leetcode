package org.alking.p100;

public class P191 {

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
    public int countPrimeSetBits(int L, int R) {
        int res = 0;
        for (int i = L; i <= R; i++) {
            int b = Integer.bitCount(i);
            if (cache[b]) {
                res += 1;
            }
        }
        return res;
    }
}
