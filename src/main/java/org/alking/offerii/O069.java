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

    public int peakIndexInMountainArray2(int[] arr) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
