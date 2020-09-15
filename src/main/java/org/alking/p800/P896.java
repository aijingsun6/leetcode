package org.alking.p800;

public class P896 {

    public boolean isMonotonic(int[] A) {

        if(A == null || A.length < 1){
            return true;
        }

        boolean bigger = A[A.length-1] > A[0];

        for(int i = 1; i < A.length;i++){

            if(bigger && A[i] < A[i-1]){
                return false;
            }

            if(!bigger && A[i] > A[i-1]){
                return false;
            }

        }
        return true;
    }
}
