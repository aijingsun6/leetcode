package org.alking.p200;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int size = nums.length - k + 1;
        int[] result = new int[size];
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }

                return o2[0] - o1[0];
            }
        });
        for (int i = 0; i < k - 1; i++) {
            queue.add(new int[]{nums[i],i});
        }
        for (int i = k - 1, j = 0; i < nums.length; i++, j++) {
            queue.add(new int[]{nums[i],i});
            int[] poll;
            while (true){
                poll = queue.poll();
                int idx = poll[1];
                if(idx == j){
                    result[j] = poll[0];
                    break;
                }else if(idx > j){
                    result[j] = poll[0];
                    queue.add(poll);
                    break;
                }else {
                    // idx < j,do nothing
                }
            }
        }
        return result;
    }
}
