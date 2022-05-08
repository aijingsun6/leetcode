package org.alking.p1500;

import java.util.ArrayDeque;

public class P1544 {

    public String makeGood(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        final int GAP = 'a' - 'A';
        final int N = s.length();
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if(!stack.isEmpty() && Math.abs(stack.peekLast() - c) == GAP){
                stack.removeLast();
            }else {
                stack.addLast(c);
            }
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            sb.append(stack.removeFirst());
        }
        return sb.toString();
    }
}
