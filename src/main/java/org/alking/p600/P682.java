package org.alking.p600;

import java.util.ArrayDeque;

public class P682 {

    public int calPoints(String[] ops) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (String s : ops) {
            if ("C".equals(s)) {
                queue.removeLast();
            } else if ("D".equals(s)) {
                int last = queue.getLast();
                queue.addLast(last * 2);
            } else if ("+".equals(s)) {
                int last = queue.removeLast();
                int last2 = queue.getLast();
                queue.addLast(last);
                queue.addLast(last + last2);
            } else {
                queue.addLast(Integer.valueOf(s));
            }
        }
        int sum = 0;
        for (Integer v : queue) {
            sum += v;
        }
        return sum;
    }
}
