package org.alking.p1700;

public class P1732 {

    public int largestAltitude(int[] gain) {
        int max = 0;
        int acc = 0;
        for(int v: gain){
            acc += v;
            max = Math.max(max,acc);
        }
        return max;
    }
}
