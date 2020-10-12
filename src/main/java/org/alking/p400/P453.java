package org.alking.p400;

import java.util.Arrays;

public class P453 {


    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i] - nums[0];
        }
        return s;

    }
}
