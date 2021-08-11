package org.alking.p700;

import java.util.*;

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


    /** 这种在这三种是最快的
     * with priority queue
     */
    public int networkDelayTime2(int[][] times, int n, int k) {
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(graph[i], -1);
        }
        for (int[] e : times) {
            // e[0] -> e[1]
            graph[e[0] - 1][e[1] - 1] = e[2];
        }

        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        dist[k - 1] = 0;
        // [from,dist]
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        queue.offer(new int[]{k - 1, 0});
        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            int from = p[0];
            final int distAcc = p[1];
            for (int to = 0; to < n; to++) {
                if (graph[from][to] > -1) {
                    int dist2 = distAcc + graph[from][to];
                    if (dist[to] < 0 || dist2 < dist[to]) {
                        dist[to] = dist2;
                        queue.offer(new int[]{to, dist2});
                    }
                }
            }

        }
        int max = 0;
        for (int v : dist) {
            if (v < 0) {
                return v;
            }
            max = Math.max(max, v);
        }
        return max;
    }

    /**
     * Bellman复杂度 (v * e)
     */
    public int networkDelayTimeBellman(int[][] times, int n, int k) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        dist[k] = 0;
        for (int i = 0; i < n; i++) {
            for (int[] e : times) {
                int from = e[0];
                int to = e[1];
                int price = e[2];
                if (dist[from] > -1) {
                    int acc = dist[from] + price;
                    if (dist[to] < 0 || acc < dist[to]) {
                        dist[to] = acc;
                    }
                }
            }
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] < 0) {
                return -1;
            }
            max = Math.max(max, dist[i]);
        }
        return max;
    }

    /**
     * Dijkstra 复杂度 (v * v)
     */
    public int networkDelayTimeDijkstra(int[][] times, int n, int k) {
        int[][] len = new int[n+1][n+1];
        for (int i = 1; i < len.length; i++) {
            for (int j = 1; j < len[i].length; j++) {
                len[i][j] = i == j ? 0 : 0x3f3f3f3f;
            }
        }
        for (int i = 0; i < times.length; i++) {
            len[times[i][0]][times[i][1]] = times[i][2];
        }
        // 源k到其他节点的时长
        int[] w = new int[n+1];
        Arrays.fill(w, 0x3f3f3f3f);
        w[k] = 0; // k到k为0
        boolean[] via = new boolean[n+1]; // 是否确定到某节点的最小时长
        for (int i = 1; i <= n; i++) {
            int t = -1;
            for (int j = 1; j <= n; j++) {
                if (!via[j] && (t == -1 || w[j] < w[t])) t = j;
            }
            via[t] = true;
            for (int j = 1; j <= n; j++) {
                w[j] = Math.min(w[j], w[t] + len[t][j]);
            }
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = Math.max(res, w[i]);
        }
        return res >= 0x3f3f3f3f ? -1 : res;
    }
}
