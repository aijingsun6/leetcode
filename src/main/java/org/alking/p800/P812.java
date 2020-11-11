package org.alking.p800;

public class P812 {

    public double largestTriangleArea(int[][] points) {
        double mmax = 0;

        for (int i = 0; i < points.length; i ++)
            for (int j = i + 1; j < points.length; j ++)
                for (int k = j + 1; k < points.length; k ++)
                    mmax = Math.max(mmax, 0.5 * Math.abs(points[i][0] * points[j][1] + points[i][1] * points[k][0] + points[j][0] * points[k][1] - points[i][0] * points[k][1] - points[i][1] * points[j][0] - points[j][1] * points[k][0]));
        return mmax;

    }
}
