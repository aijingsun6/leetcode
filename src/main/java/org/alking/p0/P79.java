package org.alking.p0;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class P79 {

    public static class Pos {

        public int x;

        public int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pos pos = (Pos) o;
            return x == pos.x &&
                    y == pos.y;
        }

        @Override
        public int hashCode() {

            return Objects.hash(x, y);
        }
    }

    public boolean exist(char[][] board, String word) {

        int iMax = board.length;
        int jMax = board[0].length;
        char[] array = word.toCharArray();

        ArrayDeque<Pos> queue = new ArrayDeque<>();

        for (int i = 0; i < iMax; i++) {
            for (int j = 0; j < jMax; j++) {
                if (board[i][j] == array[0]) {
                    Pos start = new Pos(i, j);

                    queue.addLast(start);

                    if (dfs(board, iMax, jMax, array, 1, queue, start)) {
                        return true;
                    }
                    queue.removeLast();
                }
            }
        }

        return false;
    }


    private boolean dfs(char[][] board, int iMax, int jMax, char[] arr, int from, ArrayDeque<Pos> queue, Pos last) {

        if (queue.size() == arr.length) {
            return true;
        }
        char c = arr[from];
        int x = last.x;
        int y = last.y;

        List<Pos> posList = new ArrayList<>();
        // up
        if (x > 0 && board[x - 1][y] == c) {
            posList.add(new Pos(x - 1, y));
        }
        // down
        if (x < iMax - 1 && board[x + 1][y] == c) {
            posList.add(new Pos(x + 1, y));
        }
        //left
        if (y > 0 && board[x][y - 1] == c) {
            posList.add(new Pos(x, y - 1));
        }
        // right
        if (y < jMax - 1 && board[x][y + 1] == c) {
            posList.add(new Pos(x, y + 1));
        }

        for (Pos pos : posList) {
            if (!queue.contains(pos)) {
                queue.addLast(pos);
                if (dfs(board, iMax, jMax, arr, from + 1, queue, pos)) {
                    return true;
                }
                queue.removeLast();
            }
        }

        return false;
    }


}
