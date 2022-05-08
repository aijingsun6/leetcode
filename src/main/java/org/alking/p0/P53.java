package org.alking.p0;

public class P53 {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        int sum = max;
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i],nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }


}
