package org.alking.p1700;

public class P1738 {

    public void merge(int[] A, int m, int[] B, int n) {
        int[] acc = new int[m + n];
        int pa = 0;
        int pb = 0;
        int idx = 0;

        while (pa < m || pb < n) {

            if(pa < m && pb < n){

                if(A[pa] < B[pb]){
                    acc[idx] = A[pa];
                    idx += 1;
                    pa += 1;
                }else {
                    acc[idx] = B[pb];
                    idx += 1;
                    pb += 1;
                }

            }else if(pa < m){
                acc[idx] = A[pa];
                idx += 1;
                pa +=1;
            }else {
                acc[idx] = B[pb];
                idx += 1;
                pb += 1;
            }

        }
        System.arraycopy(acc,0,A,0,m+n);

    }
}
