package org.alking.p1800;

import java.util.TreeMap;

public class P1818 {

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int N = nums1.length;
        final int MOD = 1000000007;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int v : nums1) {
            map.put(v, 1);
        }
        long acc = 0;
        int v1;
        int v2;
        int gap;
        int maxGap = 0;
        for (int i = 0; i < N; i++) {
            v1 = nums1[i];
            v2 = nums2[i];
            gap = Math.abs(v1 - v2);
            acc += gap;
            if (map.containsKey(v2)) {
                maxGap = Math.max(maxGap, gap);
            } else {
                Integer cellKey = map.ceilingKey(v2);
                Integer floorKey = map.floorKey(v2);
                int min = gap;
                if (cellKey != null) {
                    min = Math.min(min, cellKey - v2);
                }
                if (floorKey != null) {
                    min = Math.min(min, v2 - floorKey);
                }
                maxGap = Math.max(maxGap, gap - min);
            }

        }
        acc = acc - maxGap;
        return (int) (acc % MOD);
    }


}
