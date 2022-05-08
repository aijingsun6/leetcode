package org.alking.p500;

import java.util.ArrayList;

public class P526 {

    public int countArrangement(int n) {

        if (n < 2) {
            return 0;
        }
        this.result = 0;
        final int SIZE = n + 1;
        ArrayList<Integer>[] bucket = new ArrayList[SIZE];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j == 0 || j % i == 0) {
                    bucket[i].add(j);

                }
            }
        }

        backtrace(1, n, bucket, new boolean[SIZE]);
        return result;
    }

    private int result = 0;

    private void backtrace(int idx, int n, ArrayList<Integer>[] bucket, boolean[] used) {
        if (idx == n + 1) {
            result++;
            return;
        }
        for (int j : bucket[idx]) {
            if (!used[j]) {
                used[j] = true;
                backtrace(idx + 1, n, bucket, used);
                used[j] = false;
            }
        }

    }
}
