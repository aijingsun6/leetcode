package org.alking.offer;


import java.util.Stack;

public class O9 {

    class CQueue {
        private Stack<Integer> in = new Stack<>();
        private Stack<Integer> out = new Stack<>();

        public CQueue() {

        }

        public void appendTail(int value) {
            in.add(value);
        }

        public int deleteHead() {
            if (!out.isEmpty()) {
                return out.pop();
            }
            while (!in.isEmpty()) {
                out.add(in.pop());
            }
            if (out.isEmpty()) {
                return -1;
            }
            return out.pop();
        }
    }
}
