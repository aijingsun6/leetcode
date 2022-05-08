package org.alking.p500;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P594 {


    public int findLHS(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 0;
        int start = Integer.MIN_VALUE;
        int lastCnt = 0;
        int cnt = 0;

        for (int idx = 0; idx < nums.length; idx++) {
            int v = nums[idx];
            if (v == start) {
                cnt += 1;
                continue;
            }
            if (v == start + 1) {
                cnt += 1;
                lastCnt += 1;
                res = Math.max(res, cnt);
                continue;
            }
            if (v == start + 2 && nums[idx - 1] + 1 == v) {
                start = start + 1;
                cnt = lastCnt + 1;
                lastCnt = 1;
                res = Math.max(res, cnt);
                continue;
            }
            start = v;
            lastCnt = 0;
            cnt = 1;
        }
        return res;
    }

    public int findLHS2(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            int k = e.getKey();
            int n = Math.max( map.getOrDefault(k-1,0),map.getOrDefault(k+1,0));
            if(n > 0){
                max = Math.max(max,n + e.getValue());
            }
        }
        return max;
    }
}
