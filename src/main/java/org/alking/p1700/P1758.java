package org.alking.p1700;

public class P1758 {

    public int maxSubArray(int[] nums) {

        int len = nums.length;
        if(len == 0) return 0;
        if(len == 1) return nums[0];
        int[] dp = new int[len];
        int max =  nums[0];
        dp[0] = nums[0];
        for(int i = 1;i < len;i ++){
            dp[i] = Math.max(dp[i - 1] + nums[i],nums[i]);
            max   = Math.max(max , dp[i]);
        }
        return max;
    }

}
