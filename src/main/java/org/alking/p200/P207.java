package org.alking.p200;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class P207 {


    /**
     * 拓扑排序
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {

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
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (input[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int x = queue.removeFirst();
            if(relation[x] != null){
                for(int y : relation[x]){

                    if(--input[y] == 0){
                        queue.addLast(y);
                    }
                }
                relation[x] = null;
            }
        }
        for (int i = 0; i < numCourses; i++) {
            if (input[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
