package org.alking.p300;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P347 {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> counterMap = new HashMap<>();
        for (int v : nums) {
            counterMap.put(v, counterMap.getOrDefault(v, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        int size = counterMap.size();
        size = Math.min(size, k);

        for (Map.Entry<Integer, Integer> entry : counterMap.entrySet()) {

            if (queue.size() < k) {
                queue.offer(entry);
            } else {
                Map.Entry<Integer, Integer> old = queue.peek();
                if (entry.getValue() > old.getValue()) {
                    queue.poll();
                    queue.offer(entry);
                }
            }
        }
        int[] result = new int[size];
        for (int idx = size - 1; idx >= 0; idx--) {
            result[idx] = queue.poll().getKey();
        }
        return result;
    }
}
