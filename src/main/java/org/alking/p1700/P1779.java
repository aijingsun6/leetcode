package org.alking.p1700;

public class P1779 {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int idx = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int[] p = points[i];
            if (p[0] == x || p[1] == y) {
                int d = dist(x, y, p);
                if (d < min) {
                    min = d;
                    idx = i;
                }
            }
        }
        return idx;
    }

    private int dist(int x, int y, int[] p) {
        return Math.abs(x - p[0]) + Math.abs(y - p[1]);
    }
}
