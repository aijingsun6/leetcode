package org.alking.p0;

import java.util.*;

public class P47 {

    public List<List<Integer>> permuteUnique(int[] nums) {

        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> acc = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        boolean[] visit = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(queue, nums, visit, 0, acc);
        return acc;
    }


    private void dfs(ArrayDeque<Integer> queue, int[] nums, boolean[] visit, int count, List<List<Integer>> acc) {
        if (count == nums.length) {
            acc.add(new ArrayList<>(queue));
        }
        int tmp = Integer.MIN_VALUE;
        for (int idx = 0; idx < nums.length; idx++) {
            if (visit[idx]) {
                continue;
            }
            int v = nums[idx];
            if (v > tmp) {
                tmp = v;
                visit[idx] = true;
                queue.addLast(v);
                dfs(queue, nums, visit, count + 1, acc);
                queue.removeLast();
                visit[idx] = false;
            }
        }

    }

}
