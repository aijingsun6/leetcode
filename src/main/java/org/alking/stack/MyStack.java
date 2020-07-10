package org.alking.stack;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://leetcode-cn.com/explore/learn/card/queue-stack/220/conclusion/889/
 */
public class MyStack {

    private Queue<Integer> queue = new ArrayDeque<>();

    private int size = 0;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        this.queue.add(x);
        this.size += 1;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (size < 1) {
            throw new IllegalArgumentException("size");
        }
        for (int i = 0; i < size - 1; i++) {
            Integer r = queue.poll();
            queue.add(r);
        }
        Integer r = queue.poll();
        size -= 1;
        return r;
    }

    /**
     * Get the top element.
     */
    public int top() {

        if (size < 1) {
            throw new IllegalArgumentException("size");
        }
        for (int i = 0; i < size - 1; i++) {
            Integer r = queue.poll();
            queue.add(r);
        }
        Integer r = queue.poll();
        queue.add(r);
        return r;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return size == 0;
    }


}
