package org.alking.queue;

public class FindTargetSumWays {


    public int findTargetSumWays(int[] nums, int sum) {
        return findTargetSumWays(nums, sum, 0);
    }

    private int findTargetSumWays(int[] nums, int sum, int idx) {
        int size = nums.length;
        if (idx == size) {
            return sum == 0 ? 1 : 0;
        }
        int v = nums[idx];
        int s1 = findTargetSumWays(nums, sum + v, idx + 1);
        int s2 = findTargetSumWays(nums, sum - v, idx + 1);
        return s1 + s2;
    }

}
