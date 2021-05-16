package org.alking.p200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P212 {

    private static final int SIZE = 'z' - 'a' + 1;

    private static class WordNode {

        private boolean leaf = false;

        private WordNode[] map = new WordNode[SIZE];

        private String word;

        public WordNode() {
        }

        public void insertWord(String word) {
            if (word.isEmpty()) {
                return;
            }
            WordNode n = this;
            for (int i = 0; i < word.length(); i++) {
                int idx = word.charAt(i) - 'a';
                if (n.map[idx] == null) {
                    n.map[idx] = new WordNode();
                }

                n = n.map[idx];
            }
            n.leaf = true;
            n.word = word;
        }
    }

    char[][] board;
    int row;
    int col;
    Set<String> acc = new HashSet<>();

    boolean[][] visit;

    private void bfs(int i, int j, WordNode node) {

        if (node.leaf) {
            acc.add(node.word);
        }


        if (i > 0) {
            int idx = board[i - 1][j] - 'a';
            if (node.map[idx] != null && !visit[i - 1][j]) {
                visit[i - 1][j] = true;
                bfs(i - 1, j, node.map[idx]);
                visit[i - 1][j] = false;
            }
        }

        if (i < row - 1) {
            int idx = board[i + 1][j] - 'a';
            if (node.map[idx] != null && !visit[i+1][j]) {
                visit[i+1][j] = true;
                bfs(i + 1, j, node.map[idx]);
                visit[i+1][j] = false;
            }
        }

        if (j > 0) {
            int idx = board[i][j - 1] - 'a';
            if (node.map[idx] != null && !visit[i][j-1]) {
                visit[i][j-1] = true;
                bfs(i, j - 1, node.map[idx]);
                visit[i][j-1] = false;
            }
        }
        if (j < col - 1) {
            int idx = board[i][j + 1] - 'a';
            if (node.map[idx] != null && !visit[i][j+1]) {
                visit[i][j+1] = true;
                bfs(i, j + 1, node.map[idx]);
                visit[i][j+1] = false;
            }
        }

    }

    private void buildVisit(int row, int col) {
        this.visit = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            visit[i] = new boolean[col];
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        WordNode node = new WordNode();
        for (String word : words) {
            node.insertWord(word);
        }
        this.acc = new HashSet<>();
        this.row = board.length;
        this.col = board[0].length;
        this.board = board;
        this.buildVisit(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int idx = board[i][j] - 'a';
                if (node.map[idx] != null) {
                    visit[i][j] = true;
                    bfs(i, j, node.map[idx]);
                    visit[i][j] = false;
                }
            }
        }
        return new ArrayList<>(acc);
    }
}
