package org.alking.p700;

public class P788 {

    private static boolean[] cache = new boolean[10];

    private static boolean[] diffCache = new boolean[10];

    static {
        cache[0] = true;
        cache[1] = true;
        cache[2] = true;
        cache[5] = true;
        cache[6] = true;
        cache[8] = true;
        cache[9] = true;

        diffCache[2] = true;
        diffCache[5] = true;
        diffCache[6] = true;
        diffCache[9] = true;
    }

    private boolean valid(int v) {
        int t;
        boolean diff = false;
        while (v > 0) {
            t = v % 10;
            if (!cache[t]) {
                return false;
            }
            if(diffCache[t]){
                diff = true;
            }
            v = v / 10;
        }
        return diff;
    }

    public int rotatedDigits(int N) {
        int res = 0;
        for (int i = 1; i <= N; i++) {
            if (valid(i)) {
                res += 1;
            }
        }
        return res;
    }
}
