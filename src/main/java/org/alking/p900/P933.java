package org.alking.p900;

import java.util.Deque;
import java.util.LinkedList;

public class P933 {

    Deque<Integer> queue = new LinkedList<>();

    public int ping(int t) {
        queue.offer(t);
        int min = t - 3000;
        int peek;
        while ((peek = queue.peek()) < min) {
            queue.poll();
        }
        return queue.size();
    }
}
