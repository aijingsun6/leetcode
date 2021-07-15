package org.alking.p1800;

import java.util.Arrays;

public class P1846 {

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int N = arr.length;
        arr[0] = 1;
        int prev = arr[0];
        for (int i = 1; i < N; i++) {
            int v = arr[i];
            if (v > prev) {
                v = prev + 1;
                prev = v;
                arr[i] = v;
            }
        }
        return arr[N - 1];
    }

}
