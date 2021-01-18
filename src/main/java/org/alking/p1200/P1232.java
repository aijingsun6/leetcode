package org.alking.p1200;

public class P1232 {

    public boolean checkStraightLine(int[][] coordinates) {

        if (coordinates == null || coordinates.length < 3) {
            return true;
        }
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        // y - y0 / (x -x0) = (y1 - y0 )/ (x1 - x0)
        // (y - y0) * (x1 - x0) = (y1 - y0 ) * (x - x0)
        int dx = x1 - x0;
        int dy = y1 - y0;
        int z = 0;
        int x;
        int y;
        for (int i = 2; i < coordinates.length; i++) {
            y = coordinates[i][1];
            x = coordinates[i][0];
            z = (y - y0) * dx - dy * (x - x0);
            if (z != 0) {
                return false;
            }
        }
        return true;
    }
}
