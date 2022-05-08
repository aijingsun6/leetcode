package org.alking.p400;

import java.util.HashMap;
import java.util.Map;

public class P494 {

    public int findTargetSumWays(int[] nums, int target) {

        final int N = nums.length;
        HashMap<Integer, Integer>[] dp = new HashMap[N + 1];
        dp[0] = new HashMap<>();
        dp[0].put(0,1);

        for (int i = 0; i < N; i++) {
            HashMap<Integer, Integer> pre = dp[i];
            HashMap<Integer, Integer> map = new HashMap<>();
            int v = nums[i];
            for (Map.Entry<Integer, Integer> e : pre.entrySet()) {
                int s = e.getKey() + v;
                map.put(s, map.getOrDefault(s, 0) + e.getValue());
                s = e.getKey() - v;
                map.put(s, map.getOrDefault(s, 0) + e.getValue());
            }
            dp[i + 1] = map;

        }
        return (dp[N].getOrDefault(target, 0));
    }
}
