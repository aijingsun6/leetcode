package org.alking.p700;

public class P747 {

    public int dominantIndex(int[] nums) {

        if (nums == null || nums.length < 2) {
            return 0;
        }
        int max1;
        int max2;
        int maxIdx;
        if (nums[0] < nums[1]) {
            max1 = nums[1];
            max2 = nums[0];
            maxIdx = 1;
        } else {
            max1 = nums[0];
            max2 = nums[1];
            maxIdx = 0;
        }

        for (int idx = 2; idx < nums.length; idx++) {
            if (nums[idx] > max1) {
                max2 = max1;
                max1 = nums[idx];
                maxIdx = idx;
            } else if (nums[idx] > max2) {
                max2 = nums[idx];
            }
        }
        if (max2 * 2 > max1) {
            return -1;
        }
        return maxIdx;
    }
}
