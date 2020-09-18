package org.alking.p0;

import java.util.*;

public class P47 {

    public List<List<Integer>> permuteUnique(int[] nums) {

        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> acc = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        List<Integer> list = new LinkedList<>();
        for (int v : nums) {
            list.add(v);
        }
        dfs(queue, list, acc);
        return acc;
    }


    private void dfs(ArrayDeque<Integer> queue, List<Integer> left, List<List<Integer>> acc) {
        if (left.isEmpty()) {
            acc.add(new ArrayList<>(queue));
        }

        Set<Integer> set = new HashSet<>(left);
        for (Integer v : set) {
            left.remove(v);
            queue.addLast(v);
            dfs(queue, left, acc);
            queue.removeLast();
            left.add(v);
        }

    }

}
