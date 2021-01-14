package org.alking.p1200;

import java.util.ArrayList;
import java.util.List;

public class P1260 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {


        if (grid == null || grid.length < 1) {
            return null;
        }
        int iMax = grid.length;
        int jMax = grid[0].length;
        int[] tmp = new int[iMax];
        for (int i = 0; i < k; i++) {
            shiftOnce(grid, iMax, jMax, tmp);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < iMax; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < jMax; j++) {
                list.add(grid[i][j]);
            }
            result.add(list);
        }
        return result;
    }

    private void shiftOnce(int[][] grid, int iMax, int jMax, int[] tmp) {

        // cache first col
        tmp[0] = grid[iMax - 1][jMax - 1];
        for (int i = 1; i < iMax; i++) {
            tmp[i] = grid[i - 1][jMax - 1];
        }

        for (int i = 0; i < iMax; i++) {
            for (int j = jMax - 1; j > 0; j--) {
                grid[i][j] = grid[i][j - 1];
            }
        }
        for (int i = 0; i < iMax; i++) {
            grid[i][0] = tmp[i];
        }
    }
}
