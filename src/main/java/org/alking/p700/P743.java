package org.alking.p700;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P743 {

    public int networkDelayTime(int[][] times, int n, int k) {
        boolean[] visit = new boolean[n + 1];
        visit[0] = true;

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int[] t : times) {
            HashMap<Integer, Integer> m = map.getOrDefault(t[0], new HashMap<>());
            m.put(t[1], t[2]);
            map.put(t[0], m);
        }

        visit[k] = true;
        dist[0] = 0;
        dist[k] = 0;


        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.addLast(k);

        // bfs
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int p = queue.removeFirst();
                int d = dist[p];
                if (map.containsKey(p)) {
                    HashMap<Integer, Integer> m = map.get(p);
                    for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                        int to = entry.getKey();
                        int d2 = d + entry.getValue();
                        if (!visit[to]) {
                            visit[to] = true;
                            dist[to] = d2;
                            queue.addLast(to);
                        } else if (d2 < dist[to]) {
                            dist[to] = d2;
                            queue.addLast(to);
                        }
                    }
                }
            }
        }

        for (boolean v : visit) {
            if (!v) {
                return -1;
            }
        }
        int result = 0;
        for (int c : dist) {
            result = Math.max(result, c);
        }
        return result;
    }

}
