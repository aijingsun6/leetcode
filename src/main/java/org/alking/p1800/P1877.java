package org.alking.p1800;

import java.util.Arrays;

public class P1877 {

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        final int N = nums.length;
        int left = 0;
        int right = N - 1;
        int res = 0;
        while (left < right) {
            res = Math.max(res, nums[left] + nums[right]);
            left++;
            right--;
        }
        return res;

    }
}
