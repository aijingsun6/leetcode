package org.alking.p800;

import java.util.Stack;

public class P856 {

    public int scoreOfParentheses(String S) {
        // char or integer
        Stack<Object> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                int v = 0;
                while (!stack.isEmpty()){
                    Object obj = stack.pop();
                    if(obj instanceof Integer){
                        v += (Integer)obj;
                    }else if(obj instanceof Character){
                        if(v > 0){
                            stack.push(v * 2);
                        }else {
                            stack.push(1);
                        }
                        break;
                    }
                }
            }
        }
        int acc = 0;
        while (!stack.isEmpty()){
            Object obj = stack.pop();
            if(obj instanceof Integer){
                acc += (Integer)obj;
            }
        }
        return acc;
    }
}
