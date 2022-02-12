package org.alking.p1000;

import java.util.ArrayDeque;

public class P1020 {

    public int numEnclaves(int[][] grid) {

        final int ROW = grid.length;
        final int COL = grid[0].length;
        final int VISITED = 2;
        final int LAND = 1;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        // col
        for (int col = 0; col < COL; col++) {
            if (grid[0][col] == LAND) {
                grid[0][col] = VISITED;
                queue.addLast(new int[]{0, col});
            }
            if (grid[ROW - 1][col] == LAND) {
                grid[ROW - 1][col] = VISITED;
                queue.addLast(new int[]{ROW - 1, col});
            }
        }

        // col
        for (int row = 0; row < ROW; row++) {

            if (grid[row][0] == LAND) {
                grid[row][0] = VISITED;
                queue.addLast(new int[]{row, 0});
            }
            if (grid[row][COL - 1] == LAND) {
                grid[row][COL - 1] = VISITED;
                queue.addLast(new int[]{row, COL - 1});
            }
        }

        while (!queue.isEmpty()) {
            int[] p = queue.removeFirst();
            int row = p[0];
            int col = p[1];

            int[][] pos = new int[][]{
                    {row - 1, col},
                    {row + 1, col},
                    {row, col - 1},
                    {row, col + 1}
            };

            for (int[] pp : pos) {
                int r = pp[0];
                int c = pp[1];

                if (r < 0 || r >= ROW) {
                    continue;
                }

                if (c < 0 || c >= COL) {
                    continue;
                }

                if (grid[r][c] == 1) {
                    grid[r][c] = VISITED;
                    queue.addLast(new int[]{r, c});
                }
            }
        }
        int acc = 0;
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {

                if (grid[row][col] == 1) {
                    acc++;
                }

            }
        }

        return acc;
    }

}
