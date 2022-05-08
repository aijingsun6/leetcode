package org.alking.p300;

import java.util.*;

public class P310 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n < 1){
            return Collections.emptyList();
        }
        if(n < 2){
            return Arrays.asList(0);
        }
        if(n < 3){
            // n = 2
            return Arrays.asList(0,1);
        }
        int[] rudu = new int[n];
        ArrayList<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            rudu[e[0]]++;
            rudu[e[1]]++;
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        // find rudu = 1
        int left = n;
        for (int i = 0; i < n; i++) {
            if (rudu[i] == 1) {
                queue.addLast(i);
                left --;
            }
        }

        while (left > 0) {
            int s = queue.size();
            for (int i = 0; i < s; i++) {
                int pop = queue.removeFirst();
                for(int j : adj[pop]){
                    if(--rudu[j] == 1){
                        queue.addLast(j);
                        left --;
                    }
                }

            }
        }

        return new ArrayList<>(queue);
    }


}
