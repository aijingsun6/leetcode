package org.alking.p1000;

import java.util.PriorityQueue;

public class P1005 {

    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < A.length; i++) {
            queue.add(A[i]);
        }
        for (int i = 0; i < K; i++) {
            queue.add(-queue.poll());
        }
        int sum = 0;
        for (int v : queue) {
            sum += v;
        }
        return sum;
    }

}
