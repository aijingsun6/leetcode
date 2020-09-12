package org.alking.p1000;

public class P1010 {

    public int numPairsDivisibleBy60(int[] time) {

        if (time == null) {
            return 0;
        }
        int[] modCnt = new int[60];
        int sum = 0;
        for (int i = 0; i < time.length; i++) {
            int mod = time[i] % 60;
            int mod2 = (60 - mod) % 60;
            sum += modCnt[mod2];
            modCnt[mod] += 1;
        }
        return sum;
    }
}
