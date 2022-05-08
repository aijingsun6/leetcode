package org.alking.p800;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class P802 {

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            if (safe(graph, color, i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    public boolean safe(int[][] graph, int[] color, int x) {
        if (color[x] > 0) {
            return color[x] == 2;
        }
        color[x] = 1;
        for (int y : graph[x]) {
            if (!safe(graph, color, y)) {
                return false;
            }
        }
        color[x] = 2;
        return true;
    }

    public List<Integer> eventualSafeNodes2(int[][] graph) {
        final int N = graph.length;
        ArrayList<Integer>[] rev = new ArrayList[N];
        // 出度
        int[] chudu = new int[N];
        for (int i = 0; i < N; i++) {
            int[] r = graph[i];
            chudu[i] = r.length;
            for (int j : r) {

                if (rev[j] == null) {
                    rev[j] = new ArrayList<>();
                }
                rev[j].add(i);
            }
        }

        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if(chudu[i] < 1){
                q.addLast(i);
            }
        }

        while (!q.isEmpty()){
            int p = q.removeFirst();
            if(rev[p] != null){
                for(int p2: rev[p]){
                    if(--chudu[p2] < 1){
                        q.addLast(p2);
                    }
                }
            }

        }

        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
           if(chudu[i] < 1){
               ans.add(i);
           }
        }
        return ans;
    }
}
