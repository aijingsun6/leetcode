package org.alking.p500;

import java.util.Arrays;

public class P581 {

    public int findUnsortedSubarray(int[] nums) {

        if (nums == null || nums.length < 2) {
            return 0;
        }

        int[] arr = nums.clone();
        Arrays.sort(arr);

        int left = nums.length - 1;
        int right = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (arr[i] != nums[i]) {
                left = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (arr[i] != nums[i]) {
                right = i;
                break;
            }
        }

        if(left >= right){
            return 0;
        }
        return right - left + 1;

    }

    private int findUnsortedSubarray(int[] nums, int start, int end) {

        if (start >= end) {
            return 0;
        }
        int min = nums[start];
        int max = nums[end];
        for (int idx = start; idx <= end; idx++) {
            int v = nums[idx];
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }

        // find left
        if (nums[start] == min) {
            return findUnsortedSubarray(nums, start + 1, end);
        }

        if (nums[end] == max) {
            return findUnsortedSubarray(nums, start, end - 1);
        }


        return end - start + 1;
    }
}
