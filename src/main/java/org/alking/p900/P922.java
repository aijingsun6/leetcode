package org.alking.p900;

public class P922 {

    public int[] sortArrayByParityII(int[] A) {

        boolean odd = false;


        for (int i = 0; i < A.length; i++) {


            if (odd && A[i] % 2 == 0) {
                int idx = i + 1;
                while (A[idx] % 2 == 0) {
                    idx += 1;
                }
                swap(A, i, idx);
            }

            if (!odd && A[i] % 2 > 0) {
                int idx = i + 1;
                while (A[idx] % 2 > 0) {
                    idx += 1;
                }
                swap(A, i, idx);
            }
            odd = !odd;


        }
        return A;

    }

    private void swap(int[] arr, int x, int y) {
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }
}
