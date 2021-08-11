package org.alking.p700;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class P797 {

    private List<List<Integer>> acc = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        acc.clear();
        final int N = graph.length;
        int[] rudu = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j : graph[i]) {
                rudu[j]++;
            }
        }
//        for (int i = 0; i < N; i++) {
//            if (rudu[i] == 0) {
//                dfs(i, graph, new ArrayDeque<>());
//            }
//        }

        dfs(0, graph, new ArrayDeque<>());
        return acc;
    }

    private void dfs(int node, int[][] graph, ArrayDeque<Integer> q) {
        q.addLast(node);
        if(node == graph.length-1){
            acc.add(new ArrayList<>(q));
        }
        for (int j : graph[node]) {
            dfs(j, graph, q);
        }
        q.removeLast();
    }

}
