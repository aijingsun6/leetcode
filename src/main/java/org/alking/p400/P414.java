package org.alking.p400;

import java.util.HashSet;
import java.util.PriorityQueue;

public class P414 {

    public int thirdMax(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (!set.contains(n)) {
                max = Math.max(max, n);
                queue.offer(n);
                if (queue.size() > 3) {
                    queue.poll();
                }
                set.add(n);
            }
        }
        if (queue.size() < 3) {
            return max;
        }
        return queue.peek();
    }
}
