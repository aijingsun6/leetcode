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
}
