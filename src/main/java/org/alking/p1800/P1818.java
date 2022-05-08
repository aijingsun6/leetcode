package org.alking.p1800;

import java.util.Arrays;

public class P1818 {

    /**
     * 思路：
     * 1. 算出所有的绝对值之和  acc = sum( abs(nums1[i] - nums2[i]) )
     * 2. 找到绝对值差最大值  abs(nums1[i] - nums2[i]) - abs(nearest(nums1[j]-nums2[i])) ， nearest为数组1中的元素，最接近nums2[i] 的元素，与nums2[i]的差
     * 3. 1中的和减去2中的值，即为结果
     */
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int N = nums1.length;
        final int MOD = 1000000007;

        int[] array = new int[N];
        System.arraycopy(nums1, 0, array, 0, N);
        Arrays.sort(array);

        long acc = 0; // 所有的绝对值只和
        int v1;
        int v2;
        int gap;
        int maxGap = 0;
        for (int i = 0; i < N; i++) {
            v1 = nums1[i];
            v2 = nums2[i];
            gap = Math.abs(v1 - v2);
            acc += gap;
            int min = findNearestDist(array, v2);
            maxGap = Math.max(maxGap, gap - min);

        }
        acc = acc - maxGap;
        return (int) (acc % MOD);
    }

    /**
     * 使用二分法找到最接近的距离
     */
    private int findNearestDist(int[] sortedArray, int value) {
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
