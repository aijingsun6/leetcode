package org.alking.p400;

import java.util.ArrayDeque;
import java.util.Arrays;

public class P457 {

    public boolean circularArrayLoop(final int[] nums) {

        if (nums == null || nums.length == 0) {
            return false;
        }
        int[] visit = new int[nums.length];
        Arrays.fill(visit, -1);
        for (int i = 0; i < nums.length; i++) {

            if (visit[i] >= 0) {
                continue;
            }

            int idx = i;
            boolean negative = nums[idx] < 0;
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            while (visit[idx] < 0) {
                if ((negative && nums[idx] < 0) || (!negative && nums[idx] > 0)) {
                    visit[idx] = i;
                    queue.add(idx);
                    idx = ((idx + nums[idx]) % nums.length + nums.length) % nums.length;
                } else {
                    break;
                }
            }

            if(visit[idx] == i){
                while (queue.getFirst() != idx){
                    queue.removeFirst();
                }
                if(queue.size()>1){
                    return true;
                }
            }

        }
        return false;
    }
}
