package org.alking.p100;

public class P172 {

    public int trailingZeroes(int n) {

        int acc = 0;
        int p = 5;
        while (n > p) {
            int m = n / p;
            acc += m;
            p = p * 5;
        }
        return acc;

    }
}
