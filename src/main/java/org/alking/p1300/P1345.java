package org.alking.p1300;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

public class P1345 {

    public int minJumps(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            ArrayList<Integer> idx = map.getOrDefault(v, null);
            if (idx != null) {
                idx.add(i);
            } else {
                idx = new ArrayList<>();
                idx.add(i);
                map.put(v, idx);
            }
        }
        boolean[] visit = new boolean[arr.length];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.addLast(0);
        visit[0] = true;
        int step = 0;
        final int target = arr.length - 1;
        // bfs
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int idx = q.removeFirst();
                if (idx == target) {
                    return step;
                }
                if (idx + 1 < arr.length && !visit[idx + 1]) {
                    q.addLast(idx + 1);
                    visit[idx + 1] = true;
                }
                if (idx - 1 >= 0 && !visit[idx - 1]) {
                    q.addLast(idx - 1);
                    visit[idx - 1] = true;
                }

                ArrayList<Integer> list = map.get(arr[idx]);
                for (int v : list) {

                    if (!visit[v]) {
                        q.addLast(v);
                        visit[v] = true;
                    }
                }
            }
            step++;
        }
        return target;
    }
}
