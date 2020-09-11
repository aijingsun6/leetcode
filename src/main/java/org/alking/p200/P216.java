package org.alking.p200;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P216 {

    public List<List<Integer>> combinationSum3(int k, int n) {

        if (k > 9) {
            return Collections.emptyList();
        }

        int min = 0;
        for (int i = 1; i <= k; i++) {
            min += i;
        }

        int max = 0;
        for (int i = 0; i < k; i++) {
            max += (9 - i);
        }
        if (n < min || n > max) {
            return Collections.emptyList();
        }
        List<List<Integer>> acc = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        dfs(0, 0, k, n, queue, acc);
        return acc;
    }
    private void dfs(int num, int count, int k, int target, ArrayDeque<Integer> queue, List<List<Integer>> acc) {

        if (target < 0) {
            return;
        }

        if (count > k) {
            return;
        }
        if (target == 0 && count == k) {
            acc.add(new ArrayList<>(queue));
            return;
        }
        for (int i = num + 1; i <= 9; i++) {
            queue.addLast(i);
            dfs(i, count + 1, k, target - i, queue, acc);
            queue.removeLast();
        }
    }
}
