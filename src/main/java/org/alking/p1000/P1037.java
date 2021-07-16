package org.alking.p1000;

public class P1037 {

    /**
     * (y2 - y0)/(x2-x0) = (y1-y0)/(x1-x0)
     * (y2 - y0) * (x1-x0) = (x2-x0) * (y1-y0)
     *
     * @param points
     * @return
     */
    public boolean isBoomerang(int[][] points) {

        int[] p0 = points[0];
        int[] p1 = points[1];
        int[] p2 = points[2];
        int s1 = (p2[1] - p0[1]) * (p1[0] - p0[0]);
        int s2 = (p2[0] - p0[0]) * (p1[1] - p0[1]);
        return s1 != s2;
    }
}
