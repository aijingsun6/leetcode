package org.alking.p300;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class P310 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        boolean[][] conj = new boolean[n][n];
        for (int[] e : edges) {
            int x = e[0];
            int y = e[1];
            conj[x][y] = true;
            conj[y][x] = true;
        }

        List<Integer> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int h = height(conj, n, i);
            if (h < min) {
                result.clear();
                result.add(i);
                min = h;
            } else if (h == min) {
                result.add(i);
            }
        }
        return result;
    }

    private int height(boolean[][] conj, int n, int start) {
        boolean[] visit = new boolean[n];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.addLast(start);
        visit[start] = true;
        int acc = 0;
        // bfs
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int idx = queue.removeFirst();
                for (int j = 0; j < n; j++) {
                    if (conj[idx][j] && !visit[j]) {
                        queue.addLast(j);
                        visit[j] = true;
                    }
                }

            }
            if(!queue.isEmpty()){
                acc += 1;
            }

        }
        return acc;
    }

}
