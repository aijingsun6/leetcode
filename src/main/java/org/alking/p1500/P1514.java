package org.alking.p1500;

import java.util.ArrayList;

/**
 * TODO: dfs会超时
 */
public class P1514 {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {

        result = 0d;
        visit = new boolean[n];
        graph = new ArrayList[n];
        prob = new double[n][n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            graph[x].add(y);
            graph[y].add(x);
            prob[x][y] = succProb[i];
            prob[y][x] = succProb[i];
        }

        dfs(start, end, 1d);
        return result;
    }

    private ArrayList<Integer>[] graph;
    private double[][] prob;
    private double result = 0d;
    private boolean[] visit;

    private void dfs(int node, int end, double acc) {

        if (visit[node]) {
            return;
        }

        if (node == end) {
            if (acc > result) {
                result = acc;
            }
            return;
        }
        visit[node] = true;
        for (int j : graph[node]) {
            dfs(j, end, acc * prob[node][j]);
        }
        visit[node] = false;
    }

}
