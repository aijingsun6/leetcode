package org.alking.p1600;

public class P1614 {

    public int maxDepth(String s) {

        int max = 0;
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                depth++;
            } else if (c == ')') {
                depth--;
            }
            max = Math.max(max,depth);
        }
        return max;
    }
}
