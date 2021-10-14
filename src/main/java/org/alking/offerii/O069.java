package org.alking.offerii;

/**
 * https://leetcode-cn.com/problems/B1IidL/
 */
public class O069 {
    public int peakIndexInMountainArray(int[] arr) {
        int idx = 0;
        while (idx < arr.length - 1 && arr[idx] < arr[idx + 1]) {
            idx++;
        }
        return idx;
    }
}
