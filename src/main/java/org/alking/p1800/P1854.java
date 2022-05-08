package org.alking.p1800;

public class P1854 {

    public int maximumPopulation(int[][] logs) {
        final int START = 1950;
        final int END = 2050;
        final int SIZE = END - START + 1;
        int[] bucket = new int[SIZE];
        for (int[] e : logs) {
            bucket[e[0]-START] ++;
            bucket[e[1]-START] --;
        }
        int max = 0;
        int year = 0;
        int count = 0;

        for (int i = 0; i < SIZE; i++) {
            count += bucket[i];
            if (count > max) {
                max = count;
                year = START + i;
            }
        }
        return year;
    }
}
