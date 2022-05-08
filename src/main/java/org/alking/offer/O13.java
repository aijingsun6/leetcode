package org.alking.offer;

import java.util.ArrayDeque;

/**
 * https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 */
public class O13 {

    public int movingCount(int m, int n, int k) {

        int acc = 0;

        boolean[][] visit = new boolean[m][n];

        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.addLast(new int[]{0, 0});
        acc += 1;
        visit[0][0] = true;

        // bfs
        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] p = queue.removeFirst();

                int x = p[0];
                int y = p[1];

                // move right
                if (x < m - 1 && !visit[x + 1][y] && checkSum(x + 1, y, k)) {
                    queue.addLast(new int[]{x + 1, y});
                    visit[x + 1][y] = true;
                    acc += 1;
                }
                // move down
                if (y < n - 1 && !visit[x][y + 1] && checkSum(x, y + 1, k)) {
                    queue.addLast(new int[]{x, y + 1});
                    visit[x][y + 1] = true;
                    acc += 1;
                }
            }
        }

        return acc;

    }

    private boolean checkSum(int x, int y, int k) {
        return sum(x) + sum(y) <= k;
    }

    private int sum(int i) {
        int sum = 0;
        while (i > 0) {
            sum += (i % 10);
            i = i / 10;
        }
        return sum;
    }
}
