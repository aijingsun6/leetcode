package org.alking.leetcode.p3400;

public class P3423 {

    public int maxAdjacentDistance(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length;i++){
            int v = nums[i];
            int v2 = nums[(i+1)%nums.length];
            max = Math.max(max, Math.abs(v- v2));
        }
        return max;
    }
}
