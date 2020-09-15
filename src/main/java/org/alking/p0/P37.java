package org.alking.p0;

/**
 * i <- 0 -> 8
 * '1' + i
 */
public class P37 {

    private boolean[][] origin = new boolean[9][9];

    private boolean[][] rowLeft = new boolean[9][9];

    private boolean[][] colLeft = new boolean[9][9];

    private boolean[][][] rcLeft = new boolean[3][3][9];

    public void solveSudoku(char[][] board) {
        initState(board);
        dfs(0, 0, board);
    }

    private boolean dfs(int i, int j, char[][] board) {

        if (i == 9) {
            return true;
        }

        int nextI = i;
        int nextJ = j + 1;
        if (nextJ == 9) {
            nextI = i + 1;
            nextJ = 0;
        }

        if (origin[i][j]) {
            return dfs(nextI, nextJ, board);
        }

        int rci = i / 3;
        int rcj = j / 3;


        for (int v = 0; v < 9; v++) {

            if (rowLeft[i][v]) {
                continue;
            }

            if (colLeft[j][v]) {
                continue;
            }
            if (rcLeft[rci][rcj][v]) {
                continue;
            }

            board[i][j] = (char) ('1' + v);
            rowLeft[i][v] = true;
            colLeft[j][v] = true;
            rcLeft[rci][rcj][v] = true;
            if (dfs(nextI, nextJ, board)) {
                return true;
            }
            rowLeft[i][v] = false;
            colLeft[j][v] = false;
            rcLeft[rci][rcj][v] = false;
        }
        return false;

    }


    private void initState(char[][] board) {
        for (int i = 0; i < 9; i++) {
            origin[i] = new boolean[9];
            rowLeft[i] = new boolean[9];
            colLeft[i] = new boolean[9];
        }

        for (int i = 0; i < 3; i++) {
            rcLeft[i] = new boolean[3][9];
            for (int j = 0; j < 3; j++) {
                rcLeft[i][j] = new boolean[9];
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    origin[i][j] = true;
                    rowLeft[i][c - '1'] = true;
                    colLeft[j][c - '1'] = true;
                    rcLeft[i / 3][j / 3][c - '1'] = true;
                }
            }
        }
    }
}
