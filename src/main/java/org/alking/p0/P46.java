package org.alking.p0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutations/
 */
public class P46 {

    public List<List<Integer>> permute(int[] nums) {
        this.result.clear();
        final int N = nums.length;
        this.visit = new boolean[N];
        this.acc = new ArrayList<>();
        backtrace(nums);
        return this.result;
    }

    private List<List<Integer>> result = new ArrayList<>();

    private boolean[] visit;

    private List<Integer> acc;

    private void backtrace(int[] nums) {
        if (nums.length == acc.size()) {
            this.result.add(new ArrayList<>(acc));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!visit[i]){
                visit[i] = true;
                acc.add(nums[i]);
                backtrace(nums);
                acc.remove(acc.size()-1);
                visit[i] = false;
            }
        }
    }
}
