package org.alking.p800;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

public class P815 {


    public int numBusesToDestination(int[][] routes, int source, int target) {

        // 构建车站的分布图
        HashMap<Integer, ArrayList<Integer>> lines = new HashMap<>();
        int N = routes.length;
        int stationMax = 0;
        for (int i = 0; i < N; i++) {
            int[] stations = routes[i];
            for (int s : stations) {
                ArrayList<Integer> line = lines.getOrDefault(s, new ArrayList<>());
                line.add(i);
                lines.put(s, line);
                stationMax = Math.max(s, stationMax);
            }
        }


        if(source == target){
            return 0;
        }
        if (!lines.containsKey(source) || !lines.containsKey(target)) {
            return -1;
        }

        final boolean[] visit = new boolean[stationMax + 1];
        int acc = 1;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        visit[source] = true;
        ArrayList<Integer> sourceLine = lines.get(source);
        for (int line : sourceLine) {
            int[] ss = routes[line];
            for (int s : ss) {
                if (s != source) {
                    queue.addLast(new int[]{s, line});
                    visit[s] = true;
                }
            }
        }


        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] sl = queue.removeFirst();
                int station = sl[0];
                int lastLine = sl[1];
                if (station == target) {
                    return acc;
                }
                if (lines.containsKey(station)) {
                    ArrayList<Integer> line = lines.get(station);
                    for (int l : line) {
                        if (l != lastLine) {
                            int[] ss = routes[l];
                            for (int s : ss) {
                                if (!visit[s]) {
                                    visit[s] = true;
                                    queue.addLast(new int[]{s, l});
                                }
                            }
                        }
                    }
                }
            }
            acc += 1;
        }

        return -1;
    }


}
