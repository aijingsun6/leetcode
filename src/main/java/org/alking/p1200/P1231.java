package org.alking.p1200;

public class P1231 {

    public boolean checkStraightLine(int[][] coordinates) {


        if (coordinates == null || coordinates.length < 2) {
            return false;
        }

        if (coordinates[0][0] == coordinates[1][0]) {
            // x1 == x2
            for (int i = 1; i < coordinates.length; i++) {
                if (coordinates[i][0] != coordinates[0][0]) {
                    return false;
                }
            }
            return true;
        }
        // y = k * x + b
        // k = (y2 - y1)/(x2 -x1)
        double x1 = coordinates[0][0];
        double y1 = coordinates[0][1];
        double x2 = coordinates[1][0];
        double y2 = coordinates[1][1];


        double k = (y2 - y1) / (x2 - x1);
        double b = y1 - k * x1;
        double ep = 0.0001;
        for(int i = 2; i < coordinates.length;i++){
            double y = k * coordinates[i][0] + b;
            if(Math.abs(y - coordinates[i][1]) > ep){
                return false;
            }

        }
        return true;
    }
}
