package org.alking.p0;

import java.util.ArrayList;
import java.util.List;

public class P79 {

    public boolean exist(char[][] board, String word) {

        int iMax = board.length;
        int jMax = board[0].length;
        char[] array = word.toCharArray();
        boolean[][] visit = new boolean[iMax][jMax];
        for (int i = 0; i < iMax; i++) {
            for (int j = 0; j < jMax; j++) {
                if (board[i][j] == array[0]) {

                    visit[i][j] = true;
                    if (dfs(board, iMax, jMax, array, 1, visit, new int[]{i, j}, 1)) {
                        return true;
                    }
                    visit[i][j] = false;

                }
            }
        }
        return false;
    }


    private boolean dfs(char[][] board, int iMax, int jMax, char[] arr, int from, boolean[][] visit, int[] last, int count) {

        if (count == arr.length) {
            return true;
        }
        char c = arr[from];
        int x = last[0];
        int y = last[1];

        List<int[]> posList = new ArrayList<>();
        // up
        if (x > 0 && board[x - 1][y] == c) {
            posList.add(new int[]{x - 1, y});
        }
        // down
        if (x < iMax - 1 && board[x + 1][y] == c) {
            posList.add(new int[]{x + 1, y});
        }
        //left
        if (y > 0 && board[x][y - 1] == c) {
            posList.add(new int[]{x, y - 1});
        }
        // right
        if (y < jMax - 1 && board[x][y + 1] == c) {
            posList.add(new int[]{x, y + 1});
        }

        for (int[] pos : posList) {

            if (!visit[pos[0]][pos[1]]) {
                visit[pos[0]][pos[1]] = true;

                if (dfs(board, iMax, jMax, arr, from + 1, visit, pos, count + 1)) {
                    return true;
                }

                visit[pos[0]][pos[1]] = false;
            }
        }

        return false;
    }


}
