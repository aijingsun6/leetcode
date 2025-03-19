package org.alking.leetcode.p2600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P2610 {

    public List<List<Integer>> findMatrix(int[] nums) {
        int[] cnt = new int[nums.length+1];
        int maxValue = 0;
        int maxCnt = 0;
        for(int v: nums){
            maxValue = Math.max(maxValue,v);
            maxCnt = Math.max(maxCnt,++cnt[v]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < maxCnt;i++){
            List<Integer> line = new ArrayList<>();
            for(int j = 1; j <= maxValue; j++){
                if(cnt[j] > 0){
                    line.add(j);
                    cnt[j]--;
                }
            }
            res.add(line);
        }
        return res;
    }
}
