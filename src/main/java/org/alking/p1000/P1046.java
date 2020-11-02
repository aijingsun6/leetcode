package org.alking.p1000;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P1046 {

    public int lastStoneWeight(int[] stones) {
        if (stones == null || stones.length == 0) {
            return 0;
        }
        if (stones.length == 1) {
            return stones[0];
        }
        if (stones.length == 2) {
            return Math.abs(stones[0] - stones[1]);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int v : stones) {
            queue.offer(v);
        }

        while (true) {

            int size = queue.size();

            if(size == 0){
                return 0;
            }
            if (size == 1) {
                return queue.poll();
            }
            if (size == 2) {
                int v1 = queue.poll();
                int v2 = queue.poll();
                return Math.abs(v1 - v2);
            }
            int v1 = queue.poll();
            int v2 = queue.poll();
            if(v1 != v2){
                queue.offer(Math.abs(v1 - v2));
            }
        }

    }
}
