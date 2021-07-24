package org.alking.p1700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class P1743 {

    private void addAdj(HashMap<Integer, ArrayList<Integer>> map, HashSet<Integer> exist, int[] adj) {

        for (int v : adj) {
            if (exist.contains(v)) {
                exist.remove(v);
            } else {
                exist.add(v);
            }
        }

        for (int i = 0; i < 2; i++) {
            int v = adj[i];
            if (!map.containsKey(v)) {
                map.put(v, new ArrayList<>());
            }
            map.get(v).add(adj[1 - i]);
        }

    }

    public int[] restoreArray(int[][] adjacentPairs) {

        int N = adjacentPairs.length;
        int[] result = new int[N + 1];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        HashSet<Integer> exist = new HashSet<>();

        for (int i = 0; i < N; i++) {
            addAdj(map, exist, adjacentPairs[i]);
        }


        ArrayList<Integer> arr = new ArrayList<>(exist);

        result[0] = Math.min(arr.get(0),arr.get(1));
        result[1] = map.get(result[0]).get(0);
        int idx = 2;
        while (idx < result.length) {
            ArrayList<Integer> list = map.get(result[idx - 1]);
            for (int v : list) {
                if (result[idx - 2] != v) {
                    result[idx++] = v;
                    break;
                }
            }

        }
        return result;
    }
}
