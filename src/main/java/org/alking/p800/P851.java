package org.alking.p800;

import java.util.ArrayList;
import java.util.Arrays;


public class P851 {

    private ArrayList<Integer>[] rich;

    private int[] result;

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        final int N = quiet.length;
        rich = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            rich[i] = new ArrayList<>();
        }
        for (int[] e : richer) {
            rich[e[1]].add(e[0]);
        }
        result = new int[N];
        Arrays.fill(result, -1);
        for (int i = 0; i < N; i++) {
            dfs(i, quiet);
        }
        return result;
    }

    private int dfs(int node, int[] quiet) {
        if (result[node] > -1) {
            return result[node];
        }
        int min = node;
        for (int i : rich[node]) {
            int v = dfs(i, quiet);
            if (quiet[v] < quiet[min]) {
                min = v;
            }
        }
        result[node] = min;
        return min;
    }

}
