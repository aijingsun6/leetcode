package org.alking.p400;

public class P477 {

    public int totalHammingDistance(int[] nums) {
        int[] oneCnt = new int[32];
        int[] zeroCnt = new int[32];
        for (int i = 0; i < 32; i++) {
            int n = 1 << i;
            for (int v : nums) {
                if ((v & n) == 0) {
                    zeroCnt[i]++;
                } else {
                    oneCnt[i]++;

                }
            }
        }
        int acc = 0;
        for (int i = 0; i < 32; i++) {
            acc += (oneCnt[i] * zeroCnt[i]);
        }
        return acc;
    }

}
