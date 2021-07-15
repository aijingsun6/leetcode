package org.alking.p1700;

public class P1701 {

    public double averageWaitingTime(int[][] customers) {

        long endTime = 0;
        long waitSum = 0;
        final int N = customers.length;
        for (int[] customer : customers) {
            endTime = Math.max(endTime, customer[0]) + customer[1];
            waitSum += (endTime - customer[0]);
        }
        return ((double) waitSum) / N;
    }
}
