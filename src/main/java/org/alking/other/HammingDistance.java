package org.alking.other;

public class HammingDistance {

    public int hammingDistance(int x, int y) {

        int z = x ^ y ;

        int acc  = 0;

        while (Math.abs(z) > 0){
            if((z & 0x01) > 0){
                acc += 1;
            }
            z = z >>> 1;
        }
        return acc;
    }
}
