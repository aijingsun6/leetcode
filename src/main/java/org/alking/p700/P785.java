package org.alking.p700;

public class P785 {

    private static final int COLOR_WHITE = 0;

    private static final int COLOR_RED = 1;

    private static final int COLOR_BLUE = 2;

    private boolean valid = true;

    private int[] colorArray;

    public boolean isBipartite(int[][] graph) {
        final int N = graph.length;
        valid = true;
        colorArray = new int[N];
        for (int i = 0; i < N; i++) {
            if (colorArray[i] == COLOR_WHITE && valid) {

                dfs(i, COLOR_RED, graph);
            }
        }

        return valid;
    }

    private void dfs(int node, int color, int[][] graph) {
        colorArray[node] = color;
        for (int i : graph[node]) {
            if(colorArray[i] == COLOR_WHITE){
                dfs(i,colorArray[node] == COLOR_RED?COLOR_BLUE:COLOR_RED,graph);
            }
            if(colorArray[i] == color){
                valid = false;
                return;
            }
        }
    }
}
