package org.alking.p700;

import java.util.ArrayDeque;

/**
 * <a href="https://leetcode-cn.com/problems/asteroid-collision/"></a>
 */
public class P735 {

    public int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int n : asteroids) {
            if (queue.isEmpty()) {
                queue.addLast(n);
                continue;
            }
            int last;
            int coll;
            while (n < 0) {
                if(queue.isEmpty()){
                    break;
                }
                last = queue.getLast();
                if(last > 0){
                    coll = n + queue.removeLast();
                    if(coll > 0){
                        n = last;
                    }else if(coll == 0){
                        n = 0;
                    }
                }else {
                    break;
                }

            }
            if( n != 0){
                queue.addLast(n);
            }

        }
        int[] result = new int[queue.size()];

        for( int i = 0 ; i < result.length;i ++){
            result[i] = queue.removeFirst();
        }
        return result;
    }
}
