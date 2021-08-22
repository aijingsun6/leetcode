package org.alking.p1800;

public class P1827 {

    public int minOperations(int[] nums) {

        if (nums.length < 2) {
            return 0;
        }
        int acc = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                acc += (nums[i - 1] - nums[i] + 1);
                nums[i] = nums[i - 1] + 1;
            }
        }
        return acc;
    }
}
