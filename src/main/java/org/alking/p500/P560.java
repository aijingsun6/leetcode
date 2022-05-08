package org.alking.p500;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/subarray-sum-equals-k/
 */
public class P560 {

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> cntMap = new HashMap<>();
        cntMap.put(0,1);
        int sum = 0;
        int t;
        int acc = 0;
        for (int v : nums) {
            sum += v;
            t = sum - k;
            if(cntMap.containsKey(t)){
                acc += cntMap.get(t);
            }
            cntMap.put(sum, cntMap.getOrDefault(sum,0)+1);
        }
        return acc;
    }
}
