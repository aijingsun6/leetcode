package org.alking.p1100;

import java.util.ArrayDeque;

public class P1190 {

    public String reverseParentheses(String s) {
        int idx = 0;
        int size = s.length();
        ArrayDeque<String> stack = new ArrayDeque<>(size);
        while (idx < size) {

            // 1. 找到字符串
            int to = idx;
            while (to < size && Character.isLetter(s.charAt(to))) {
                to++;
            }
            if (to > idx) {
                String p = s.substring(idx, to);
                stack.addLast(p);
            }
            if (to < size) {
                if (s.charAt(to) == '(') {
                    stack.addLast("(");
                } else {
                    StringBuilder sb = new StringBuilder();
                    while (!stack.isEmpty()) {
                        String p = stack.removeLast();
                        if ("(".equals(p)) {
                            break;
                        } else {
                            sb.append(new StringBuffer(p).reverse().toString());
                        }
                    }
                    stack.addLast(sb.toString());
                }
            }
            idx = to + 1;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeFirst());
        }
        return sb.toString();
    }
}
