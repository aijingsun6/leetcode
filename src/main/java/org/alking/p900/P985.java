package org.alking.p900;

public class P985 {

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {

        int sum = 0;
        for (int v : A) {
            if (v % 2 == 0) {
                sum += v;
            }
        }

        int[] result = new int[A.length];

        for (int idx = 0; idx < A.length; idx++) {

            int[] ope = queries[idx];
            int val = ope[0];
            int id = ope[1];

            int before = A[id];
            int after = before + val;
            A[id] = after;

            int add = 0;
            if (before % 2 == 0 && after % 2 == 0) {
                add = after - before;
            } else if (before % 2 == 0) {
                add = -before;
            } else if (after % 2 == 0) {
                add = after;
            }
            sum = sum + add;
            result[idx] = sum;
        }

        return result;
    }
}
