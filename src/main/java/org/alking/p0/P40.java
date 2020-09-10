package org.alking.p0;

import java.util.*;

public class P40 {


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        if (candidates == null || candidates.length == 0) {
            return Collections.emptyList();
        }
        Arrays.sort(candidates);
        Set<List<Integer>> acc = new HashSet<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        dfs(candidates, target, 0, queue, acc);
        return new ArrayList<>(acc);
    }

    private void dfs(int[] candidates, int target, int from, ArrayDeque<Integer> queue, Set<List<Integer>> acc) {

        if (target < 0) {
            return;
        }
        if (target == 0) {
            acc.add(new ArrayList<>(queue));
            return;
        }
        if (from >= candidates.length) {
            return;
        }
        // target > 0
        for (int idx = from; idx < candidates.length; idx++) {
            int v = candidates[idx];
            queue.addLast(v);
            dfs(candidates, target - v, idx + 1, queue, acc);
            queue.removeLast();
        }

    }

}
