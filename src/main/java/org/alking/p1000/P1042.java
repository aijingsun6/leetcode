package org.alking.p1000;

import java.util.ArrayList;

public class P1042 {

    private int[] COLORS;
    private ArrayList<Integer>[] graph;

    public int[] gardenNoAdj(int n, int[][] paths) {

        // build env
        COLORS = new int[n];
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] p : paths) {
            graph[p[0] - 1].add(p[1] - 1);
            graph[p[1] - 1].add(p[0] - 1);
        }


        for (int i = 0; i < n; i++) {
            if (COLORS[i] == 0) {
                dfs(i);
            }
        }

        return COLORS;
    }

    private int selectColor(int i) {

        int[] choose = new int[]{1, 2, 3, 4};
        for (int j : graph[i]) {
            int c = COLORS[j];
            if (c > 0) {
                choose[c - 1] = 0;
            }
        }
        for (int v : choose) {
            if (v > 0) {
                return v;
            }
        }
        return 1;
    }

    private void dfs(int i) {
        int color = selectColor(i);
        COLORS[i] = color;
        for(int j: graph[i]){
            if(COLORS[j]==0){
                dfs(j);
            }
        }
    }

}
