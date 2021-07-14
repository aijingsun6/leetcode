package org.alking.p1800;

import java.util.Arrays;

public class P1818 {

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int N = nums1.length;
        final int MOD = 1000000007;

        int[] array = new int[N];
        System.arraycopy(nums1, 0, array, 0, N);
        Arrays.sort(array);

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
            int min = findNearest(array, v2);
            maxGap = Math.max(maxGap, gap - min);

        }
        acc = acc - maxGap;
        return (int) (acc % MOD);
    }

    private int findNearest(int[] sortedArray, int value) {
        int N = sortedArray.length;
        int left = 0;
        int right = N - 1;
        if (value < sortedArray[left]) {
            return sortedArray[left] - value;
        }
        if (value > sortedArray[right]) {
            return value - sortedArray[right];
        }
        int min = Integer.MAX_VALUE;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int v = sortedArray[mid];
            if (v > value) {
                min = Math.min(min, v - value);
                right = mid;
            } else if (v < value) {
                min = Math.min(min, value - v);
                left = mid + 1;
            } else {
                return 0;
            }
        }
        if (left == right) {
            min = Math.min(min, Math.abs(sortedArray[left] - value));
        }
        return min;
    }

}
