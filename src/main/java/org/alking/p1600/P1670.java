package org.alking.p1600;

public class P1670 {

    public int maxSubArray(int[] nums) {

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length;i++){
            dp[i]=Math.max(dp[i-1]+ nums[i], nums[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
