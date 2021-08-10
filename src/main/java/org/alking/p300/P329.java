package org.alking.p300;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class P329 {

    private int ROW;
    private int COL;
    private int TOTAL;

    private int getIndex(int row, int col) {
        return row * COL + col;
    }

    public int longestIncreasingPath(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        ROW = matrix.length;
        COL = matrix[0].length;
        TOTAL = ROW * COL;
        // idx = row * col + col
        int[] rudu = new int[TOTAL];
        ArrayList<Integer>[] adj = new ArrayList[TOTAL];
        for (int i = 0; i < TOTAL; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                int idx = getIndex(row, col);
                // up < now
                if (row > 0 && matrix[row - 1][col] < matrix[row][col]) {
                    rudu[idx]++;
                    adj[getIndex(row - 1, col)].add(idx);
                }
                // down < now
                if ((row + 1) < ROW && matrix[row + 1][col] < matrix[row][col]) {
                    rudu[idx]++;
                    adj[getIndex(row + 1, col)].add(idx);
                }
                // left < now
                if (col > 0 && matrix[row][col - 1] < matrix[row][col]) {
                    rudu[idx]++;
                    adj[getIndex(row, col - 1)].add(idx);
                }
                // right < now
                if ((col + 1) < COL && matrix[row][col + 1] < matrix[row][col]) {
                    rudu[idx]++;
                    adj[getIndex(row, col + 1)].add(idx);
                }
            }
        }

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < TOTAL; i++) {
            if (rudu[i] == 0) {
                queue.addLast(i);
            }
        }

        int acc = 0;
        while (!queue.isEmpty()) {

            int size = queue.size();
            acc += 1;
            for (int i = 0; i < size; i++) {
                int p = queue.removeFirst();
                for (int j : adj[p]) {
                    if (--rudu[j] == 0) {
                        queue.addLast(j);
                    }
                }
            }

        }
        return acc;
    }
}
