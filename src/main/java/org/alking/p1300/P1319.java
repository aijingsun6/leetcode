package org.alking.p1300;

import java.util.ArrayList;

public class P1319 {

    public int makeConnected(int n, int[][] connections) {

        if (connections.length < n - 1) {
            return -1;
        }
        // init graph
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < connections.length; i++) {
            int x = connections[i][0];
            int y = connections[i][1];
            graph[x].add(y);
            graph[y].add(x);
        }
        this.partitions = 0;
        this.visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                this.partitions += 1;
                dfs(i);
            }
        }
        return partitions - 1;
    }

    private int partitions = 0;
    private ArrayList<Integer>[] graph;
    private boolean[] visit;

    private void dfs(int n) {
        if (visit[n]) {
            return;
        }
        visit[n] = true;
        for (int j : graph[n]) {
            if (!visit[j]) {
                dfs(j);
            }
        }
    }
}
