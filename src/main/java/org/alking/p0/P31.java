package org.alking.p0;

import java.util.Arrays;

public class P31 {


    public void nextPermutation(int[] nums) {

        if (nums == null || nums.length < 2) {
            return;
        }

        int index = nums.length - 1;
        while (index > 0 && nums[index] <= nums[index - 1]) {
            index--;
        }
        if (index == 0) {
            Arrays.sort(nums);
            return;
        }

        int min = nums[index];
        int minIdx = index;
        for (int i = index; i < nums.length; i++) {
            if (nums[i] > nums[index - 1] && nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }
        }
        int tmp = nums[index - 1];
        nums[index - 1] = nums[minIdx];
        nums[minIdx] = tmp;
        Arrays.sort(nums, index, nums.length);

    }
}
