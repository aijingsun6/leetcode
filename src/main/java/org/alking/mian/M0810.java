package org.alking.mian;

/**
 * https://leetcode-cn.com/problems/color-fill-lcci/
 */
public class M0810 {
    private boolean[][] visit;
    private int ROW;
    private int COL;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        ROW = image.length;
        COL = image[0].length;
        int oldColor = image[sr][sc];
        visit = new boolean[ROW][COL];
        dfs(image, sr, sc, oldColor, newColor);
        return image;
    }

    private void dfs(int[][] image, int row, int col, int oldColor, int newColor) {

        if (visit[row][col]) {
            return;
        }

        image[row][col] = newColor;
        visit[row][col] = true;
        if (row > 0 && image[row - 1][col] == oldColor) {
            dfs(image, row - 1, col, oldColor, newColor);
        }
        if (row + 1 < ROW && image[row + 1][col] == oldColor) {
            dfs(image, row + 1, col, oldColor, newColor);
        }
        if(col > 0 && image[row][col-1] == oldColor){
            dfs(image, row, col-1, oldColor, newColor);
        }
        if(col+1 < COL && image[row][col+1] == oldColor){
            dfs(image, row, col+1, oldColor, newColor);
        }

    }
}
