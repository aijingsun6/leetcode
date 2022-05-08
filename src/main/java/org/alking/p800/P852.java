package org.alking.p800;

/**
 * https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
 */
public class P852 {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        while (arr[i] < arr[i+1]) i++;
        return i;
    }
}
