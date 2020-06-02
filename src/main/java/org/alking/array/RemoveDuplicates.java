package org.alking.array;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        int max = nums.length;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    for (int k = i; k < max - 1; k++) {
                        nums[k] = nums[k + 1];
                    }
                    i = i - 1;
                    max = max - 1;
                }
            }
        }
        return max;
    }
}
