package org.alking.p400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P417 {

    private static final int STATUS_NONE = -1;
    private static final int STATUS_TPY = 1;
    private static final int STATUS_DXY = 2;
    private static final int STATUS_ALL = STATUS_TPY | STATUS_DXY;

    private int ROW;
    private int COL;
    private int[][] status;
    private int[][] heights;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        ROW = heights.length;
        COL = heights[0].length;
        status = new int[ROW][COL];
        this.heights = heights;
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                int v = dfs(row, col);
                if (v == STATUS_ALL) {
                    res.add(Arrays.asList(row, col));
                } else if(row == 0 || col == 0 || row +1 == ROW || col+1 == COL){
                    v |= fix(row,col);
                    if(v == STATUS_ALL){
                        res.add(Arrays.asList(row, col));
                    }
                }

            }
        }
        return res;
    }

    private int fix(int row, int col){
        int v = status[row][col];
        // up
        if (row > 0 && heights[row][col] >= heights[row - 1][col]) {
            int up = dfs(row - 1, col);
            if (up > 0) {
                v |= up;
            }
        }
        // down
        if (row + 1 < ROW && heights[row][col] >= heights[row + 1][col]) {
            int down = dfs(row + 1, col);
            if (down > 0) {
                v |= down;
            }
        }
        // left
        if (col > 0 && heights[row][col] >= heights[row][col - 1]) {
            int left = dfs(row, col - 1);
            if (left > 0) {
                v |= left;
            }
        }
        if (col + 1 < COL && heights[row][col] >= heights[row][col + 1]) {
            int right = dfs(row, col + 1);
            if (right > 0) {
                v |= right;
            }
        }
        return v;
    }

    private int dfs(int row, int col) {
        if (status[row][col] != 0) {
            return status[row][col];
        }
        int v = 0;
        if (row == 0 || col == 0) {
            v |= STATUS_TPY;
        }
        if (row == ROW - 1 || col == COL - 1) {
            v |= STATUS_DXY;
        }
        if (v > 0) {
            status[row][col] = v;
            return v;
        }
        // up
        if (row > 0 && heights[row][col] >= heights[row - 1][col]) {
            int up = dfs(row - 1, col);
            if (up > 0) {
                v |= up;
            }
        }
        // down
        if (row + 1 < ROW && heights[row][col] >= heights[row + 1][col]) {
            int down = dfs(row + 1, col);
            if (down > 0) {
                v |= down;
            }
        }
        // left
        if (col > 0 && heights[row][col] >= heights[row][col - 1]) {
            int left = dfs(row, col - 1);
            if (left > 0) {
                v |= left;
            }
        }
        if (col + 1 < COL && heights[row][col] >= heights[row][col + 1]) {
            int right = dfs(row, col + 1);
            if (right > 0) {
                v |= right;
            }
        }
        if (v == 0) {
            v = STATUS_NONE;
        }
        status[row][col] = v;
        return v;
    }

}
