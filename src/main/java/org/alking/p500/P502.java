package org.alking.p500;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class P502 {

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        final int N = profits.length;
        //profit,cap
        // profile 从大小小
        // cap 从小到大
        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o2[0] - o1[0];
            }
        });
        for (int i = 0; i < N; i++) {
            q.offer(new int[]{profits[i], capital[i]});
        }
        // 复杂度 k * log(N)
        while (k > 0 && !q.isEmpty()) {
            int[] find = null;
            ArrayList<int[]> cache = new ArrayList<>();
            while (!q.isEmpty()) {
                int[] p = q.poll();
                if (p[1] > w) {
                    cache.add(p);
                } else {
                    // 成本够了
                    find = p;
                    break;
                }
            }
            if (find == null) {
                break;
            }
            for (int[] e : cache) {
                q.offer(e);
            }
            w += find[0];
            k -= 1;
        }
        return w;
    }

    public int findMaximizedCapital_V2(int k, int w, int[] profits, int[] capital) {
        final int N = profits.length;
        // int[profit,cap]
        // cap <= w 的按照profit降序排列
        PriorityQueue<int[]> left = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        // int[profit,cap]
        // cap > w 的按照cap 升序排列
        PriorityQueue<int[]> right = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        // 操作步骤
        // 1. 从left中pop 出来一个
        // 2. 计算出w
        // 3. 将right 中 cap <= 2中计算的w 的数据移到左边队列

        for (int i = 0; i < N; i++) {
            int[] e = new int[]{profits[i], capital[i]};
            if (e[1] > w) {
                right.offer(e);
            } else {
                left.offer(e);
            }
        }
        while (k > 0 && !left.isEmpty()) {
            int[] p = left.poll();
            w += p[0];
            while (!right.isEmpty()) {
                p = right.peek();
                if (p[1] > w) {
                    break;
                } else {
                    left.offer(right.poll());
                }
            }
            k--;
        }
        return w;
    }
}
