package org.alking.p1300;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P1356 {

    private int calcBits(Integer v) {
        int acc = 0;
        while (v > 0) {
            if ((v & 1) > 0) {
                acc++;
            }
            v = v >> 1;
        }
        return acc;
    }

    public int[] sortByBits(int[] arr) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int b1 = calcBits(o1);
                int b2 = calcBits(o2);
                if (b1 == b2) {
                    return o1 - o2;
                } else {
                    return b1 - b2;
                }
            }
        });
        for (int v : arr) {
            queue.offer(v);
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = queue.poll();
        }
        return res;
    }
}
