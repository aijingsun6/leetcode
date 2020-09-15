package org.alking.p400;

import java.util.HashSet;
import java.util.PriorityQueue;

public class P414 {

    public int thirdMax(int[] nums) {

        if(nums == null || nums.length == 0){

            return -1;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(3);
        HashSet<Integer> set = new HashSet<>();
        for( int v : nums){

            if(set.contains(v)){
               continue;
            }

            set.add(v);
            if(queue.size() < 3){
                queue.add(v);
            }else if(queue.peek() < v){

                queue.poll();
                queue.add(v);
            }

        }

        if(queue.size() < 3){

            while (queue.size() > 1){
                queue.poll();
            }
            return queue.poll();
        }

        return queue.peek();

    }
}
