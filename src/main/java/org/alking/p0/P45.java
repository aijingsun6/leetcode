package org.alking.p0;

import java.util.ArrayDeque;

public class P45 {

    /**
     * bfs
     */
    public int jump(int[] nums) {
        final int N = nums.length;
        final int target = N - 1;
        boolean[] visit = new boolean[N];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(0);
        int acc = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int idx = q.removeFirst();
                if (idx == target) {
                    return acc;
                }
                int step = nums[idx];
                int start = idx + 1;
                int end = Math.min(idx + step, N - 1);
                for (int j = start; j <= end; j++) {
                    if (!visit[j]) {
                        visit[j] = true;
                        q.addLast(j);
                    }
                }
            }
            acc += 1;
        }
        return acc;
    }
}
