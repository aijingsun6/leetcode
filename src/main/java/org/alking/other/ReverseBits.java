package org.alking.other;


public class ReverseBits {

    public int reverseBits(int n) {
        int acc = 0;
        int t = 0;
        for (int i = 0; i < 32; i++) {
            t = n & 0x01;
            n = n >>> 1;
            acc |= (t << (31 - i));
        }
        return acc;
    }
}
