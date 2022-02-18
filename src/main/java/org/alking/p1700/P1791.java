package org.alking.p1700;

public class P1791 {

    public int findCenter(int[][] edges) {

        int N = edges.length + 1;
        int[] rudu = new int[N + 1];
        for (int[] e : edges) {
            for (int i : e) {
                if (++rudu[i] == edges.length) {
                    return i;
                }
            }
        }
        return -1;
    }


    public int findCenter2(int[][] edges) {

        int[] p1 = edges[0];
        int[] p2 = edges[1];

        if (p1[0] == p2[0] || p1[0] == p2[1]) {
            return p1[0];
        }
        if (p1[1] == p2[0] || p1[1] == p2[1]) {
            return p1[1];
        }

        return -1;
    }
}
