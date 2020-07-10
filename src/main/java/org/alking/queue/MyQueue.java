package org.alking.queue;

import java.util.Stack;

/**
 * https://leetcode-cn.com/explore/learn/card/queue-stack/220/conclusion/888/
 */
public class MyQueue {

    private Stack<Integer> prev = new Stack<>();

    private Stack<Integer> curr = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        curr.push(x);
    }

    public int pop() {
        if (prev.isEmpty()) {
            Integer p;
            while (!curr.isEmpty()) {
                p = curr.pop();
                prev.push(p);
            }
        }
        return prev.pop();
    }

    public int peek() {
        if (prev.isEmpty()) {
            Integer p;
            while (!curr.isEmpty()) {
                p = curr.pop();
                prev.push(p);
            }
        }
        return prev.peek();
    }

    public boolean empty() {
        return prev.isEmpty() && curr.isEmpty();

    }
}
