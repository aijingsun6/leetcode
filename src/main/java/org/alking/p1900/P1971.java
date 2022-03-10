package org.alking.p1900;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * https://leetcode-cn.com/problems/find-if-path-exists-in-graph/
 */
public class P1971 {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if (source == destination) {
            return true;
        } else if (edges == null || edges.length == 0) {
            return false;
        }
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        boolean[] visit = new boolean[n];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(source);
        visit[source] = true;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Integer f = q.removeFirst();
                for (int v : graph[f]) {
                    if (v == destination) {
                        return true;
                    }
                    if (!visit[v]) {
                        q.add(v);
                        visit[v] = true;
                    }
                }
            }
        }
        return false;
    }
}
