package org.alking.p600;

public class P674 {

    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return 1;
        }

        int result = 1;
        int acc = 1;
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > last) {
                acc += 1;
                result = Math.max(result, acc);
            } else {
                acc = 1;
            }
            last = nums[i];
        }
        return result;
    }
}
