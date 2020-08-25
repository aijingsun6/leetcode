package org.alking.p700;

import java.util.ArrayDeque;

/**
 * https://leetcode-cn.com/problems/flood-fill/
 */
public class P733 {


    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int iMax = image.length;
        int jMax = image[0].length;
        if (sr < 0 || sr >= iMax) {
            return image;
        }
        if (sc < 0 || sc >= jMax) {
            return image;
        }
        if(image[sr][sc] == newColor){
            return image;
        }


        ArrayDeque<int[]> queue = new ArrayDeque<>();
        boolean[][] visit = new boolean[iMax][jMax];


        int oldColor = image[sr][sc];

        queue.add(new int[]{sr, sc});
        visit[sr][sc] = true;
        image[sr][sc] = newColor;

        while (!queue.isEmpty()) {
            int[] n = queue.getFirst();
            int x = n[0];
            int y = n[1];
            walk(queue, visit, image, x + 1, y, iMax, jMax, oldColor, newColor);
            walk(queue, visit, image, x - 1, y, iMax, jMax, oldColor, newColor);
            walk(queue, visit, image, x, y + 1, iMax, jMax, oldColor, newColor);
            walk(queue, visit, image, x, y - 1, iMax, jMax, oldColor, newColor);
            queue.removeFirst();
        }
        return image;
    }

    private void walk(ArrayDeque<int[]> queue, boolean[][] visit, int[][] image, int x, int y, int iMax, int jMax, int oldColor, int newColor) {

        if (x < 0 || x >= iMax) {
            return;
        }
        if (y < 0 || y >= jMax) {
            return;
        }
        if (!visit[x][y] && image[x][y] == oldColor) {
            image[x][y] = newColor;
            queue.add(new int[]{x, y});
            visit[x][y] = true;
        }
    }
}
