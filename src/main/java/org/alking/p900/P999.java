package org.alking.p900;

public class P999 {


    public int numRookCaptures(char[][] board) {

        int iMax = board.length;
        int jMax = board[0].length;
        int result = 0;
        for (int i = 0; i < iMax; i++) {

            for (int j = 0; j < jMax; j++) {

                if (board[i][j] == 'R') {
                    // left
                    if (j > 0) {

                        int idx = j - 1;
                        while (idx > 0 && board[i][idx] == '.') {
                            idx--;
                        }
                        if (idx >= 0 && board[i][idx] == 'p') {
                            result += 1;
                        }

                    }
                    // right
                    if (j < jMax - 1) {
                        int idx = j + 1;

                        while (idx < jMax && board[i][idx] == '.') {
                            idx += 1;
                        }
                        if (idx < jMax && board[i][idx] == 'p') {
                            result += 1;
                        }

                    }
                    // up
                    if (i > 0) {

                        int idx = i - 1;
                        while (idx > 0 && board[idx][j] == '.') {
                            idx -= 1;
                        }
                        if (idx >= 0 && board[idx][j] == 'p') {
                            result += 1;
                        }

                    }
                    // down
                    if (i < iMax - 1) {
                        int idx = i + 1;
                        while (idx < iMax && board[idx][j] == '.') {
                            idx += 1;
                        }
                        if (idx < iMax && board[idx][j] == 'p') {
                            result += 1;
                        }
                    }

                }


            }
        }

        return result;
    }

}
