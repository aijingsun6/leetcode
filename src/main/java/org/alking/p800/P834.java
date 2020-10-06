package org.alking.p800;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class P834 {

    public int[] sumOfDistancesInTree(int N, int[][] edges) {

        int[] result = new int[N];
        if (edges == null || edges.length == 0) {
            return result;
        }
        HashMap<Integer, HashSet<Integer>> edgeMap = calcEdgeMap(edges);


        HashMap<Integer, HashMap<Integer, Integer>> acc = new HashMap<>();


        for (int i = 0; i < N; i++) {


            int sum = 0;

            for (int j = 0; j < N; j++) {

                if (j != i) {
                    int dist = dist(i, j, N, edgeMap, acc);
                    sum += dist;
                }

            }
            result[i] = sum;

        }
        return result;
    }

    private int dist(int from, int to, int N, HashMap<Integer, HashSet<Integer>> map, HashMap<Integer, HashMap<Integer, Integer>> acc) {

        if (acc.containsKey(from) && acc.get(from).containsKey(to)) {
            return acc.get(from).get(to);
        }
        if (acc.containsKey(to) && acc.get(to).containsKey(from)) {
            return acc.get(to).get(from);
        }

        int dist = dist(from,to,N,map);
        HashMap<Integer, Integer> m = acc.getOrDefault(from, new HashMap<>());
        m.put(to, dist);
        acc.put(from, m);
        return dist;

    }

    private int dist(int from, int to, int N, HashMap<Integer, HashSet<Integer>> map){
        boolean[] visit = new boolean[N];
        int dist = 0;
        ArrayList<Integer> queue = new ArrayList<>();
        queue.add(from);
        // visit[from] = true;

        while (!queue.isEmpty()) {
            ArrayList<Integer> col = new ArrayList<>();
            for (Integer i : queue) {

                if (i == to) {
                    return dist;
                }
                if (visit[i]) {
                    continue;
                }
                visit[i] = true;
                col.addAll(map.get(i));
            }
            dist += 1;
            queue = col;
        }
        return 0;
    }

    private HashMap<Integer, HashSet<Integer>> calcEdgeMap(int[][] edges) {

        HashMap<Integer, HashSet<Integer>> acc = new HashMap<>();
        for (int[] edge : edges) {

            int a = edge[0];
            int b = edge[1];
            HashSet<Integer> setA = acc.getOrDefault(a, new HashSet<>());
            setA.add(b);
            acc.put(a, setA);

            HashSet<Integer> setB = acc.getOrDefault(b, new HashSet<>());
            setB.add(a);
            acc.put(b, setB);
        }
        return acc;

    }
}
