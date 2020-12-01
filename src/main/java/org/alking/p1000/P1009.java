package org.alking.p1000;

public class P1009 {
    public int bitwiseComplement(int N) {
        if(N == 0){
            return 1;
        }
        int origin = N;
        N |= N >> 1;
        N |= N >> 2;
        N |= N >> 4;
        N |= N >> 8;
        N |= N >> 16;
        return N - origin;

    }

}
