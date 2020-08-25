package org.alking.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;

import java.util.List;

public class UpdateMatrix {

    public int[][] updateMatrix(int[][] matrix) {

        int iMax = matrix.length;
        int jMax = matrix[0].length;

        int[][] result = new int[iMax][jMax];
        for (int i = 0; i < iMax; i++) {

            for (int j = 0; j < jMax; j++) {
                result[i][j] = findDist(matrix, i, j, iMax, jMax);
            }

        }
        return result;
    }

    private int findDist(int[][] matrix, int i, int j, int iMax, int jMax) {

        int n = matrix[i][j];
        if (n == 0) {
            return 0;
        }
        boolean[][] visit = new boolean[iMax][jMax];
        int step = 0;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        visit[i][j] = true;
        queue.addLast(new int[]{i, j});
        List<int[]> acc;
        int px;
        int py;
        while (!queue.isEmpty()) {

            acc = new ArrayList<>();
            while (!queue.isEmpty()) {
                acc.add(queue.removeFirst());
            }
            step = step + 1;
            for (int[] pos : acc) {
                List<int[]> nearBys = nearBy(pos, iMax, jMax);
                for (int[] near : nearBys) {
                    px = near[0];
                    py = near[1];
                    if (visit[px][py]) {
                        // visited
                        continue;
                    }
                    if (matrix[px][py] == 0) {
                        return step;
                    }
                    visit[px][py] = true;
                    queue.addLast(near);
                }
            }
        }
        return 0;

    }

    private List<int[]> nearBy(int[] pos, int iMax, int jMax) {
        List<int[]> acc = new ArrayList<>();
        int px = pos[0];
        int py = pos[1];
        acc.add(new int[]{px - 1, py});
        acc.add(new int[]{px + 1, py});
        acc.add(new int[]{px, py - 1});
        acc.add(new int[]{px, py + 1});
        List<int[]> result = new ArrayList<>();
        for(int[] e : acc){
            if(validPos(e,iMax,jMax)){
                result.add(e);
            }
        }
        return result;
    }

    private boolean validPos(int[] pos, int iMax, int jMax) {
        int i = pos[0];
        int j = pos[1];
        if (i < 0 || i >= iMax) {
            return false;
        }

        if (j < 0 || j >= jMax) {
            return false;
        }
        return true;
    }
}
