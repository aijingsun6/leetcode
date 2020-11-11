package org.alking.p900;


public class P908 {

    public int smallestRangeI(int[] A, int K) {

        int min = A[0];
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        return Math.max(0, max - min - K * 2);

    }
}
