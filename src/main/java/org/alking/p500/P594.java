package org.alking.p500;

import java.util.Arrays;

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
        int cnt = 0;

        for(int v: nums){
               if(v == start){
                   cnt += 1;
                   continue;
               }
               if(v == start+1){
                   cnt += 1;
                   res = Math.max(res, cnt);
                   continue;
               }
               start = v;
               cnt = 1;
        }
        return res;
    }
}
