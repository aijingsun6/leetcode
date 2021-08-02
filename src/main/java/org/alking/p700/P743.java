package org.alking.p700;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P743 {

    public int networkDelayTime(int[][] times, int n, int k) {
        boolean[] visit = new boolean[n + 1];
        visit[0] = true;
        int[] cost = new int[n + 1];
        Arrays.fill(cost, -1);

        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int[] time : times) {
            HashMap<Integer, Integer> m = map.getOrDefault(time[0], new HashMap<>());
            m.put(time[1], time[2]);
            map.put(time[0], m);
        }
        dfs(map, k, visit, cost, 0);
        for (boolean v : visit) {
            if (!v) {
                return -1;
            }
        }
        int result = 0;
        for (int c : cost) {
            result = Math.max(result, c);
        }
        return result;
    }

    private void dfs(final HashMap<Integer, HashMap<Integer, Integer>> map, int from, final boolean[] visit, final int[] cost, int acc) {

        if (visit[from] && cost[from] < acc) {
            return;
        }
        visit[from] = true;
        cost[from] = acc;
        if (map.containsKey(from)) {
            HashMap<Integer, Integer> m = map.get(from);
            for (Map.Entry<Integer, Integer> e : m.entrySet()) {
                dfs(map, e.getKey(), visit, cost, acc + e.getValue());
            }
        }

    }
}
