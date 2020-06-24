package org.alking.queue;

import java.util.Stack;

public class EvalRPN {

    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();
        for (String s : tokens) {
            if (stack.isEmpty()) {
                switch (s) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        throw new IllegalStateException();
                    default:
                        stack.push(s);
                        break;
                }
            } else {

                // stack is not empty
                boolean isOp = false;
                switch (s) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        isOp = true;
                        break;
                    default:
                        break;
                }

                if (isOp) {
                    Integer a = Integer.parseInt(stack.pop());
                    Integer b = Integer.parseInt(stack.pop());
                    int c = 0;
                    switch (s) {
                        case "+":
                            c = b + a;
                            break;
                        case "-":
                            c = b - a;
                            break;
                        case "*":
                            c = a * b;
                            break;
                        case "/":
                            c = b / a;
                            break;
                        default:
                            break;
                    }
                    stack.push(String.valueOf(c));
                } else {
                    stack.push(s);
                }
            }
        }
        return Integer.valueOf(stack.pop());
    }
}
