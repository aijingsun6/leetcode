package org.alking.p2000;

public class P2006 {

    public int countKDifference(int[] nums, int k) {
        int[] bucket = new int[101];
        for (int v : nums) {
            bucket[v]++;
        }
        int acc = 0;
        for (int i = k + 1; i < 101; i++) {
            acc += bucket[i] * bucket[i - k];
        }
        return acc;
    }
}
