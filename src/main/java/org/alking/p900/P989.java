package org.alking.p900;

import java.util.*;

public class P989 {

    public List<Integer> addToArrayForm(int[] A, int K) {

        Stack<Integer> stack = new Stack<>();
        for (int v : A) {
            stack.push(v);
        }
        String s = String.valueOf(K);
        Stack<Integer> ks = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            ks.push(s.charAt(i) - '0');
        }
        int carry = 0;
        LinkedList<Integer> acc = new LinkedList<>();
        int a;
        int b;
        int v;
        while (!stack.isEmpty() && !ks.isEmpty()) {
            a = stack.pop();
            b = ks.pop();
            v = a + b + carry;
            acc.addFirst(v % 10);
            carry = v / 10;
        }

        Stack<Integer> ss = null;
        if (!stack.isEmpty()) {
            ss = stack;
        } else if (!ks.isEmpty()) {
            ss = ks;
        }else {
            ss = new Stack<>();
        }
        while (!ss.isEmpty()) {
            v = ss.pop() + carry;
            acc.addFirst(v % 10);
            carry = v / 10;
        }
        if (carry > 0) {
            acc.addFirst(carry);
        }

        return acc;
    }
}
