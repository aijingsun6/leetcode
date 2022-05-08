package org.alking.p1000;

import java.util.HashMap;
import java.util.HashSet;

public class P1001 {

    private int size;

    private HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

    private void on2(int row, int col) {
        HashSet<Integer> s = map.getOrDefault(row, null);
        if (s == null) {
            s = new HashSet<>();
            map.put(row, s);
        }
        s.add(col);
    }

    private void on(int row, int col) {
        // row
        HashSet<Integer> s = map.getOrDefault(row, null);
        if (s == null) {
            s = new HashSet<>();
            map.put(row, s);
        }
        for (int i = 0; i < size; i++) {
            s.add(i);
        }
        // col
        for (int i = 0; i < size; i++) {
            on2(i, col);
        }
        //


        for (int i = 0; i < size; i++) {
            int j = i + row - col;
            if (0 <= j && j < size) {
                on2(i, j);
                on2(j, i);
            }
            j = i + col - row;
            if (0 <= j && j < size) {
                on2(i, j);
                on2(j, i);
            }
        }
    }

    private void off(int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            HashSet<Integer> s = map.getOrDefault(i, null);
            if (s != null) {
                for (int j = col - 1; j <= col + 1; j++) {
                    s.remove(j);
                }
            }
        }
    }

    private int status(int row, int col) {
        HashSet<Integer> s = map.getOrDefault(row, null);
        if (s == null) {
            return 0;
        }
        return s.contains(col) ? 1 : 0;
    }

    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        size = n;
        map.clear();
        for (int[] p : lamps) {
            on(p[0], p[1]);
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int row = queries[i][0];
            int col = queries[i][1];
            result[i] = status(row, col);
            off(row, col);
        }
        return result;
    }
}
