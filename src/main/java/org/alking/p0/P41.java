package org.alking.p0;

public class P41 {

    public int firstMissingPositive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 1;
        }

        for (int i = 0; i < nums.length; i++) {

            int j = nums[i];
            int t;
            while (j > 0 && j <= nums.length && nums[j - 1] != j) {
                t = nums[j-1];
                nums[j - 1] = j;
                j = t;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
