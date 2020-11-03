package org.alking.p700;

import java.util.PriorityQueue;

public class P703 {

    class KthLargest {

        private PriorityQueue<Integer> queue = new PriorityQueue<>();

        private int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            for (int v : nums) {
                add(v);
            }
        }

        public int add(int val) {
            queue.add(val);
            int size = queue.size();
            if (size > k) {
                queue.poll();
            }
            return queue.peek();
        }
    }
}
