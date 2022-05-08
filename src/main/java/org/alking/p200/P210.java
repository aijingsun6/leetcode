package org.alking.p200;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class P210 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<Integer>[] relation = new ArrayList[numCourses];

        int[] input = new int[numCourses];
        for (int[] p : prerequisites) {
            // x -> y
            int x = p[0];
            int y = p[1];
            input[x]++;
            if (relation[y] == null) {
                relation[y] = new ArrayList<>();
            }
            relation[y].add(x);
        }
        int[] result = new int[numCourses];
        int offset = 0;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (input[i] == 0) {
                result[offset++] = i;
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int x = queue.removeFirst();
            if (relation[x] != null) {
                for (int y : relation[x]) {
                    if (--input[y] == 0) {
                        queue.addLast(y);
                        result[offset++] = y;
                    }
                }
                relation[x] = null;
            }
        }
        for (int i = 0; i < numCourses; i++) {
            if (input[i] > 0) {
                return new int[0];
            }
        }
        return result;
    }
}
