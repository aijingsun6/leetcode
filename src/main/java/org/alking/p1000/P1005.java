package org.alking.p1000;

import java.util.PriorityQueue;

public class P1005 {

    public int largestSumAfterKNegations(int[] A, int K) {
        if (A == null || A.length < 1) {
            return 0;
        }

        PriorityQueue<Integer> negQ = new PriorityQueue<>();

        int min = Integer.MAX_VALUE;

        int sum = 0;

        for (int v : A) {

            if (v < 0) {
                negQ.add(v);
            } else {
                sum += v;
            }
            min = Math.min(min, Math.abs(v));
        }

        if (K < negQ.size()) {
            for (int i = 0; i < K; i++) {
                sum -= negQ.poll();
            }
            while (!negQ.isEmpty()) {
                sum += negQ.poll();
            }
            return sum;
        }

        while (!negQ.isEmpty()) {
            sum -= negQ.poll();
            K--;
        }
        if (K % 2 == 0) {
            return sum;
        }
        return sum - min * 2;
    }

}
