package org.alking.p900;

import java.util.ArrayList;

public class P990 {

    private static final int START = 'a';
    private static final int END = 'z' + 1;

    private final int[] parent = new int['z' + 1];
    private final int[] rank = new int['z' + 1];

    private void init() {
        for (int i = START; i < END; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    private int find(int i) {
        while (parent[i] != i) {
            parent[i] = parent[parent[i]];
            i = parent[i];
        }
        return i;
    }

    private void merge(int i, int j) {
        if (i == j) {
            return;
        }
        int x = find(i);
        int y = find(j);
        if (rank[x] <= rank[y]) {
            parent[x] = y;
        } else {
            parent[y] = x;
        }
        if (rank[x] == rank[y] && x != y) {
            rank[y]++;
        }
    }

    /**
     * 使用并查集
     * 先将等式给连通，再挨个检查不等式
     */
    public boolean equationsPossible(String[] equations) {

        init();
        ArrayList<int[]> noEq = new ArrayList<>();

        for (String s : equations) {
            char x = s.charAt(0);
            char e = s.charAt(1);
            char y = s.charAt(3);
            if (e == '=') {
                merge(x, y);
            } else if (e == '!') {
                noEq.add(new int[]{x, y});
            }
        }

        for (int[] no : noEq) {
            int x = find(no[0]);
            int y = find(no[1]);
            if (x == y) {
                return false;
            }
        }

        return true;
    }
}
