package org.alking.p400;

public class P461 {

    public int hammingDistance(int x, int y) {

        int z = x ^ y;

        int acc = 0;
        while (z > 0) {
            acc += (z & 1);
            z = z >> 1;
        }
        return acc;
    }

}
