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
            for(int[] e: cache){
                q.offer(e);
            }
            w += find[0];
            k -= 1;
        }
        return w;
    }
}
