package org.alking.p500;


import java.util.ArrayList;

public class P514 {

    public static class Node {

        public char c;

        public ArrayList<int[]> acc = new ArrayList<>();

        public Node(char c) {
            this.c = c;
        }
    }

    private int calcDist(int i, int j, int len) {
        int dist1 = (j + len - i) % len;
        int dist2 = (i + len - j) % len;
        return Math.min(dist1, dist2) + 1;
    }

    private ArrayList<Integer>[] calcCache(String ring) {
        ArrayList<Integer>[] map = new ArrayList['z' - 'a' + 1];
        for (int i = 0; i < ring.length(); i++) {
            int idx = ring.charAt(i) - 'a';
            if (map[idx] == null) {
                map[idx] = new ArrayList<>();
            }
            map[idx].add(i);
        }
        return map;
    }

    public int findRotateSteps(String ring, String key) {
        ArrayList<Integer>[] map = calcCache(ring);
        Node[] dp = new Node[key.length()];
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            ArrayList<Integer> idxList = map[c - 'a'];
            Node n = new Node(c);
            if (i == 0) {
                for (int idx : idxList) {
                    int dist = calcDist(0, idx, ring.length());
                    n.acc.add(new int[]{idx, dist});
                }
            } else {
                ArrayList<int[]> acc = dp[i - 1].acc;
                for (int idx : idxList) {
                    int min = Integer.MAX_VALUE;
                    for (int[] prev : acc) {
                        int dist = prev[1] + calcDist(prev[0], idx, ring.length());
                        min = Math.min(min, dist);
                    }
                    n.acc.add(new int[]{idx, min});
                }
            }
            dp[i] = n;
        }
        Node node = dp[key.length() - 1];
        int min = Integer.MAX_VALUE;
        for (int[] arr : node.acc) {
            min = Math.min(min, arr[1]);
        }
        return min;
    }


}
