package org.alking.p1700;

public class P1752 {

    public boolean check(int[] nums) {

        int acc = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                acc++;
            }
        }
        if (acc < 1) {
            return true;
        } else if (acc > 1) {
            return false;
        } else {
            return nums[0] >= nums[nums.length - 1];
        }

    }
}
