package org.alking.p1000;

import java.util.ArrayDeque;
import java.util.Stack;

public class P1021 {

    public String removeOuterParentheses(String S) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int N = S.length();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if(c == '('){
                stack.push(i);
                continue;
            }else{
                int left = stack.pop();
                if(stack.isEmpty()){
                    sb.append(S.substring(left+1,i));
                }
            }
        }
        return sb.toString();
    }
}
