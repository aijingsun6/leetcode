package org.alking.p400;

public class P492 {

    public int[] constructRectangle(int area) {

        if(area < 1){
            return new int[]{1,1};
        }

        int a = (int) Math.sqrt(area);
        if (a * a == area) {
            return new int[]{a, a};
        }

        for (int i = a; i > 1; i--) {
            if(area % i == 0){
                return new int[]{area/i, i};
            }
        }

        return new int[]{area,1};
    }
}
