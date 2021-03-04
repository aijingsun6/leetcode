package org.alking.p300;

import java.util.Arrays;

public class P300 {

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int size = nums.length;
        int[] dp = new int[size];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < size; i++) {
            int n = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    n = Math.max(n, dp[j]);
                }
            }
            n = n + 1;
            dp[i] = n;
            max = Math.max(max, n);

        }
        return max;
    }


}
