package org.alking.p600;

public class P693 {

    public boolean hasAlternatingBits(int n) {
        int origin = n;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (origin ^ origin >>> 1) == n;

    }
}
