package org.alking.p1100;

public class P1184 {


    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int n = distance.length;
        int sum = 0;
        int sumStart = 0;
        int sumDest = 0;
        for (int i = 0; i < n; i++) {
            if (i == start) {
                sumStart = sum;
            }
            if (i == destination) {
                sumDest = sum;
            }

            sum += distance[i];

        }
        int dist = Math.abs(sumDest - sumStart);
        return Math.min(dist, sum - dist);

    }
}
