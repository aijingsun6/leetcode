package org.alking.p700;

import java.util.ArrayList;
import java.util.List;

public class P797 {

    private List<List<Integer>> acc = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        acc.clear();
        final int N = graph.length;
        dfs(0, N - 1, graph, new ArrayList<>());
        return acc;
    }

    private void dfs(int node, int target, int[][] graph, ArrayList<Integer> q) {
        q.add(node);
        if (node == target) {
            acc.add(new ArrayList<>(q));
            q.remove(q.size()-1);
            return;
        }
        for (int j : graph[node]) {
            dfs(j, target, graph, q);
        }
        q.remove(q.size()-1);
    }

}
