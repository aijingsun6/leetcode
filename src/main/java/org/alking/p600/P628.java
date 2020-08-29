package org.alking.p600;

import java.util.Arrays;

public class P628 {

    public int maximumProduct(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length < 4) {
            int acc = 1;
            for (int v : nums) {
                acc = acc * v;
            }
            return acc;
        }

        Arrays.sort(nums);
        int size = nums.length;
        int right = nums[size - 1] * nums[size - 2] * nums[size - 3];
        int left = nums[size - 1] * nums[0] * nums[1];
        return Math.max(left, right);
    }
}
