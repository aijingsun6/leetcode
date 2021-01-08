package org.alking.p500;

import java.util.HashMap;

public class P547 {

    public int findCircleNum(int[][] isConnected) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int rowMax = isConnected.length;
        for (int i = 0; i < rowMax; i++) {
            int[] row = isConnected[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] > 0) {
                    map.put(i, j);
                }
            }
        }
        boolean[] root = new boolean[rowMax];
        int acc = 0;
        for (int i = 0; i < rowMax; i++) {
            int r = findRoot(map, i);
            if (!root[r]) {
                root[r] = true;
                acc += 1;
            }
        }
        return acc;
    }

    private int findRoot(HashMap<Integer, Integer> map, int start) {
        int v;
        while (true) {
            v = map.get(start);
            if (v == start) {
                return start;
            }
            start = v;
        }
    }


}
