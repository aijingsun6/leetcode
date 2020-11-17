package org.alking.p1000;

import java.util.ArrayDeque;

public class P1030 {

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        boolean[][] visit = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            visit[i] = new boolean[C];
        }
        int[][] res = new int[R * C][2];
        int idx = 0;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{r0, c0});
        int x0;
        int y0;
        int x;
        int y;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();
                x0 = poll[0];
                y0 = poll[1];
                if (!visit[x0][y0]) {
                    res[idx++] = poll;
                    visit[x0][y0] = true;

                    // left
                    x = x0;
                    y = y0 - 1;
                    if (y >= 0 && !visit[x][y]) {
                        queue.add(new int[]{x, y});
                    }
                    // right
                    x = x0;
                    y = y0 + 1;
                    if (y < C && !visit[x][y]) {
                        queue.add(new int[]{x, y});
                    }
                    // up
                    x = x0 - 1;
                    y = y0;
                    if (x >= 0 && !visit[x][y]) {
                        queue.add(new int[]{x, y});
                    }
                    // down
                    x = x0 + 1;
                    y = y0;
                    if (x < R && !visit[x][y]) {
                        queue.add(new int[]{x, y});
                    }
                }

            }
        }
        return res;
    }

}
