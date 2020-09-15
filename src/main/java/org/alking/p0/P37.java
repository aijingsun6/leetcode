package org.alking.p0;

import java.util.*;

public class P37 {

    private boolean[][] origin = new boolean[9][9];

    private Set<Character>[] rowLeft = new Set[9];

    private Set<Character>[] colLeft = new Set[9];

    private Set<Character>[][] rcLeft = new Set[3][3];

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
        Set<Character> s = new HashSet<>(rowLeft[i]);
        s.retainAll(colLeft[j]);
        s.retainAll(rcLeft[rci][rcj]);
        if (s.isEmpty()) {
            return false;
        }
        System.out.println(String.format("(%d,%d) options:%s", i, j, s));
        for (char c : s) {
            board[i][j] = c;
            rowLeft[i].remove(c);
            colLeft[j].remove(c);
            rcLeft[rci][rcj].remove(c);
            if (dfs(nextI, nextJ, board)) {
                return true;
            }
            board[i][j] = '.';
            rowLeft[i].add(c);
            colLeft[j].add(c);
            rcLeft[rci][rcj].add(c);
        }
        return false;

    }


    private void initState(char[][] board) {
        List<Character> all = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9');
        // init origin
        for (int i = 0; i < 9; i++) {
            origin[i] = new boolean[9];
            rowLeft[i] = new HashSet<>(all);
            colLeft[i] = new HashSet<>(all);
        }

        for (int i = 0; i < 3; i++) {
            rcLeft[i] = new HashSet[3];
            for (int j = 0; j < 3; j++) {
                rcLeft[i][j] = new HashSet<>(all);
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    origin[i][j] = true;
                    rowLeft[i].remove(c);
                    colLeft[j].remove(c);
                    rcLeft[i / 3][j / 3].remove(c);
                }
            }
        }
    }
}
