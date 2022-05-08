package org.alking.p1600;

import java.util.Arrays;

public class P1619 {

    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length;
        int p = (int) (size * 5 / 100);
        int sum = 0;
        int n = 0;
        for (int i = p; i < size - p; i++) {
            sum += arr[i];
            n += 1;
        }
        return ((double) sum) / n;

    }

}
