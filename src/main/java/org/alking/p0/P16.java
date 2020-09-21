package org.alking.p0;

import java.util.Arrays;

public class P16 {

    public int threeSumClosest(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length <= 3) {
            int sum = 0;
            for (int v : nums) {
                sum += v;
            }
            return sum;
        }

        Arrays.sort(nums);
        int size = nums.length;
        int min = nums[0] + nums[1] + nums[2];
        int max = nums[size - 1] + nums[size - 2] + nums[size - 3];
        if (target <= min) {
            return min;
        }

        if (target >= max) {
            return max;
        }

        int sum = nums[0] + nums[1] + nums[size - 1];
        int gap = Math.abs(sum - target);

        int tmpSum = 0;
        int tmpGap = 0;
        for (int i = 0; i < size - 2; i++) {
            int left = i + 1;
            int right = size - 1;
            while (left < right) {

                tmpSum = nums[i] + nums[left] + nums[right];
                tmpGap = Math.abs(tmpSum-target);
                if(tmpGap == 0){
                    return target;
                }
                if(tmpGap < gap){
                    sum = tmpSum;
                    gap = tmpGap;
                }
                if (tmpSum > target) {
                    right = right - 1;
                }else {
                    left = left + 1;
                }
            }

        }

        return sum;
    }
}
