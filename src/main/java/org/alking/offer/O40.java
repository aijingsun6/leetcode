package org.alking.offer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class O40 {

    public int[] getLeastNumbers(int[] arr, int k) {

        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int v : arr) {
            q.offer(v);
            if (q.size() > k) {
                q.poll();
            }
        }
        int[] result = new int[q.size()];
        int idx = result.length - 1;

        while (!q.isEmpty()) {
            result[idx--] = q.poll();
        }
        return result;
    }
}
