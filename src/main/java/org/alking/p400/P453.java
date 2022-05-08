package org.alking.p400;

public class P453 {


    public int minMoves(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        long sum = 0;
        int min = nums[0];
        int v;
        for (int i = 0; i < nums.length; i++) {
            v = nums[i];
            min = Math.min(min, v);
            sum += v;
        }
        return (int) (sum - min * nums.length);
    }
}
