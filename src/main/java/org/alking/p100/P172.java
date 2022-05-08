package org.alking.p100;

public class P172 {

    public int trailingZeroes(int n) {

        int acc = 0;
        while (n > 0) {
            int m = n / 5;
            acc += m;
            n = n / 5;
        }
        return acc;

    }
}
