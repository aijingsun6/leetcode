package org.alking.p900;

import java.util.Arrays;

public class P977 {

    public int[] sortedSquares(int[] A) {

        for(int i = 0; i < A.length; i++){
            A[i] = A[i] * A[i];
        }

        Arrays.sort(A);
        return A;
    }
}
