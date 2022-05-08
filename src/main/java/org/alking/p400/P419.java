package org.alking.p400;

public class P419 {

    private char[][] board;
    private int ROW;
    private int COL;

    private int result = 0;

    public int countBattleships(char[][] board) {
        this.board = board;
        this.ROW = board.length;
        this.COL = board[0].length;
        this.result = 0;
        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                dfs(r, c, false);
            }
        }
        return result;
    }

    private void dfs(int row, int col, boolean first) {
        if (board[row][col] != 'X') {
            return;
        }
        if (!first) {
            result++;
        }
        board[row][col] = 'V';
        // right
        if (col + 1 < COL) {
            dfs(row, col + 1, true);
        }
        if (row + 1 < ROW) {
            dfs(row + 1, col, true);
        }
    }

    public int countBattleshipsV2(char[][] board) {
        final int row = board.length;
        final int col = board[0].length;
        int cnt = 0;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if(board[r][c] != 'X'){
                    continue;
                }
                if(r > 0 && board[r-1][c] == 'X'){
                    continue;
                }
                if(c > 0 && board[r][c-1] == 'X'){
                    continue;
                }
                cnt ++;

            }
        }
        return cnt;
    }
}
