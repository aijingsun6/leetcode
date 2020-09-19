package org.alking.p1200;

public class P1275 {

    private static final int A = 1;
    private static final int B = 2;
    private static final int[][][] WIN = new int[][][]{
            {{0, 0}, {0, 1}, {0, 2}},
            {{1, 0}, {1, 1}, {1, 2}},
            {{2, 0}, {2, 1}, {2, 2}},
            {{0, 0}, {1, 0}, {2, 0}},
            {{0, 1}, {1, 1}, {2, 1}},
            {{0, 2}, {1, 2}, {2, 2}},
            {{0, 0}, {1, 1}, {2, 2}},
            {{0, 2}, {1, 1}, {2, 0}}
    };

    public String tictactoe(int[][] moves) {

        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            board[i] = new int[3];
        }
        boolean changeA = true;
        for (int[] move : moves) {
            if (changeA) {
                board[move[0]][move[1]] = A;
            } else {
                board[move[0]][move[1]] = B;
            }
            changeA = !changeA;
        }
        if (checkWin(board, A)) {
            return "A";
        }
        if (checkWin(board, B)) {
            return "B";
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }


    private boolean checkWin(int[][] board, int num) {

        for (int[][] pos : WIN) {


            boolean match = true;


            for (int[] p : pos) {

                if (board[p[0]][p[1]] != num) {
                    match = false;
                    break;
                }

            }
            if (match) {
                return true;
            }

        }
        return false;

    }
}
