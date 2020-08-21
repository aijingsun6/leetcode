package org.alking.p500;

import java.util.ArrayDeque;
import java.util.Objects;

public class P529 {

    public static class Position {
        public int x;

        public int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return x == position.x &&
                    y == position.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return String.format("(%d,%d)",x,y);
        }
    }

    public char[][] updateBoard(char[][] board, int[] click) {

        int cx = click[0];
        int cy = click[1];
        if (!validPos(board, cx, cy)) {
            return board;
        }
        if (board[cx][cy] == 'M') {
            // 挖到雷了，游戏结束
            board[cx][cy] = 'X';
            return board;
        }
        if (board[cx][cy] != 'E') {
            // 无效操作
            return board;
        }
        int sizeX = board.length;
        int sizeY = board[0].length;
        boolean[][] visit = new boolean[sizeX][sizeY];


        ArrayDeque<Position> queue = new ArrayDeque<>();
        // bfs
        queue.add(new Position(cx, cy));
        visit[cx][cy] = true;
        changeBoard(board, cx, cy, false);
        while (!queue.isEmpty()) {
            Position p = queue.pop();

            for (int x = p.x - 1; x <= p.x + 1; x++) {
                for (int y = p.y - 1; y <= p.y + 1; y++) {
                    if(validPos(board,x,y)){
                        if(visit[x][y]){
                            continue;
                        }
                        if(board[x][y] != 'M'){
                            changeBoard(board, x, y, true);
                            Position p2 = new Position(x, y);
                            queue.addLast(p2);
                            System.out.println(p2);
                        }
                        visit[x][y] = true;
                    }
                }

            }
        }

        return board;
    }

    private boolean validPos(char[][] board, int x, int y) {
        if (x < 0 || y < 0) {
            return false;
        }
        if (x >= board.length) {
            return false;
        }
        char[] row = board[x];
        if (y >= row.length) {
            return false;
        }
        return true;

    }

    private void changeBoard(char[][] board, int x, int y, boolean checkB) {
        if (board[x][y] == 'X') {
            return;
        }
        int cnt = 0;
        boolean hasB = false;
        for (int m = x - 1; m <= x + 1; m++) {
            for (int n = y - 1; n <= y + 1; n++) {
                if (m == x && n == y) {
                    continue;
                }
                if (validPos(board, m, n)) {

                    if (board[m][n] == 'M') {
                        cnt += 1;
                    }
                    if (board[m][n] == 'B') {
                        hasB = true;
                    }
                }
            }
        }
        if (checkB && !hasB) {
            // no changes
            return;
        }
        if (cnt == 0) {
            board[x][y] = 'B';
        } else {
            board[x][y] = (char) ('0' + cnt);
        }
    }

}
