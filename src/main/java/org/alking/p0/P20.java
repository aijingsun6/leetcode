package org.alking.p0;

import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/valid-parentheses/">20. 有效的括号</a>
 */
public class P20 {

    private boolean checkChar(Stack<Character> stack, char c) {
        char left = '(';
        switch (c) {
            case ')':
                left = '(';
                break;
            case ']':
                left = '[';
                break;
            case '}':
                left = '{';
                break;
            default:
                break;
        }
        if (stack.isEmpty()) {
            return false;
        }
        char pop = stack.pop();
        return pop == left;
    }

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        int size = s.length();
        if (size % 2 > 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int idx = 0; idx < size; idx++) {

            char c = s.charAt(idx);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                case ']':
                case '}':
                    if (!checkChar(stack, c)) {
                        return false;
                    }
                    break;
                default:
                    break;
            }

        }
        return stack.isEmpty();
    }
}
