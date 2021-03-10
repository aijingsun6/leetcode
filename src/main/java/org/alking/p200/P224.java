package org.alking.p200;

import java.util.Stack;

public class P224 {

    private Stack<String> stack = new Stack<>();

    public int calculate(String s) {
        stack.clear();
        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            if (c == 32) {
                i++;
                continue;
            }

            if (c == '(') {
                stack.push("(");
                i++;
                continue;
            }
            if (c == '+') {
                stack.push("+");
                i++;
                continue;
            }
            if (c == '-') {
                stack.push("-");
                i++;
                continue;
            }

            if (c == ')') {
                String p = stack.pop();
                stack.pop();
                pushNumber(Integer.valueOf(p));
                i++;
                continue;
            }
            int num = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
                i++;
            }
            pushNumber(num);

        }
        return Integer.valueOf(stack.pop());
    }

    private void pushNumber(int n) {
        if (stack.isEmpty()) {
            stack.push(String.valueOf(n));
            return;
        }
        String p = stack.peek();
        if ("+".equals(p)) {
            stack.pop();
            Integer i = Integer.valueOf(stack.pop()) + n;
            stack.push(String.valueOf(i));
            return;
        }
        if ("-".equals(p)) {
            stack.pop();
            if(stack.isEmpty()){
                stack.push(String.valueOf(-n));
                return;
            }
            Integer i = Integer.valueOf(stack.pop()) - n;
            stack.push(String.valueOf(i));
            return;
        }
        stack.push(String.valueOf(n));
    }


}
