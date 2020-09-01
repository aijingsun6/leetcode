package org.alking.p1200;

/**
 * https://leetcode-cn.com/problems/minimum-time-visiting-all-points/
 */
public class P1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        int dist = 0;
        for (int i = 1; i < points.length; i++) {
            dist += calcDist(points[i - 1], points[i]);
        }
        return dist;
    }

    private int calcDist(int[] p1, int[] p2) {

        int dx = Math.abs(p1[0] - p2[0]);
        int dy = Math.abs(p1[1] - p2[1]);
        return Math.min(dx, dy) + Math.abs(dx - dy);
    }
}
