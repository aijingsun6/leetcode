package org.alking.p200;

import java.util.PriorityQueue;

public class P215 {

    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int v : nums) {
            int size = queue.size();
            if (size < k) {
                queue.offer(v);
            } else {
                int min = queue.peek();
                if(v > min){
                    queue.poll();
                    queue.offer(v);
                }
            }
        }
        return queue.peek();
    }
}
