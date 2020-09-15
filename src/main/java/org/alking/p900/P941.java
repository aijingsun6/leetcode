package org.alking.p900;

public class P941 {

    public boolean validMountainArray(int[] A) {

        if(A == null || A.length < 1){
            return false;
        }

        boolean bigger = true;

        int prev = A[0];

        for (int idx = 1; idx < A.length; idx++) {

            if (bigger && A[idx] > prev) {

                // normal
                prev = A[idx];
                continue;
            } else if (bigger && A[idx] < prev) {
                if(idx < 2){
                    return false;
                }
                //
                prev = A[idx];
                bigger = false;
                continue;

            } else if (!bigger && A[idx] < prev) {
                prev = A[idx];
                continue;
            }

            return false;

        }

        return !bigger;
    }
}
