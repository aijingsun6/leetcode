package org.alking.p400;

import java.util.*;

public class P491 {

    List<Integer> cur;

    List<List<Integer>> res;

    private void dfs(int[] nums, int i){
        if(i == nums.length){
            if(cur.size() >= 2){
                res.add(new ArrayList<>(cur));
            }
            return;
        }
        int v =  nums[i];

        if(cur.isEmpty() || cur.get(cur.size() - 1) <= v){
            cur.add(v);
            dfs(nums, i + 1);
            cur.remove(cur.size() - 1);
        }
        if(cur.isEmpty() || cur.get(cur.size()-1) != v){
            dfs(nums,i + 1);
        }
    }

    /**
     * 入口函数
     */
    public List<List<Integer>> findSubsequences(int[] nums) {


        cur = new ArrayList<>();
        res = new ArrayList<>();
        dfs(nums,0);
        return res;
    }



}
