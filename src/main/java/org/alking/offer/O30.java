package org.alking.offer;

import java.util.Stack;

public class O30 {

    public static class MinStack {

        public MinStack() {

        }
        private Stack<Integer> stack = new Stack<>();

        private Stack<Integer> minStack = new Stack<>();

        public void push(int x) {

            stack.push(x);

            if (minStack.isEmpty()) {
                minStack.push(x);
            } else {
                int peek = minStack.peek();
                minStack.push(x < peek ? x : peek);
            }
        }

        public void pop() {

            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();

        }

        public int min() {
            return minStack.peek();
        }
    }
}
