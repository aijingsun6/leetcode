package org.alking.p800;

import java.util.ArrayList;

public class P886 {

    private static final int COLOR_WHITE = 0;
    private static final int COLOR_RED = 1;
    private static final int COLOR_BLUE = 2;

    private boolean valid;
    private int[] colorArray;
    private ArrayList<Integer>[] adj;


    public boolean possibleBipartition(int n, int[][] dislikes) {

        valid = true;
        colorArray = new int[n];
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] e : dislikes) {
            int x = e[0]-1;
            int y = e[1]-1;
            adj[x].add(y);
            adj[y].add(x);
        }

        for (int i = 0; i < n; i++) {
            dfs(i, COLOR_RED);
        }

        return valid;
    }

    private void dfs(int node, int color) {

        if (!valid) {
            return;
        }
        if (colorArray[node] != COLOR_WHITE) {
            return;
        }
        // 先标记
        colorArray[node] = color;
        int color2 = (color == COLOR_RED ? COLOR_BLUE : COLOR_RED);
        for (int j : adj[node]) {
            if(colorArray[j] != COLOR_WHITE && colorArray[j] != color2){
                valid = false;
                return;
            }
            dfs(j, color2);
        }
    }


}
